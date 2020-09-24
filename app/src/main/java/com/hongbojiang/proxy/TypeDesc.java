package com.hongbojiang.proxy;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum TypeDesc {
    EMPTY, M_V;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPTY: return "\u5176\u5b83\u7248\u672c\u53ef\u64ad";
            case M_V: return "MV\u53ef\u64ad";
        }
        return null;
    }

    @JsonCreator
    public static TypeDesc forValue(String value) throws IOException {
        if (value.equals("\u5176\u5b83\u7248\u672c\u53ef\u64ad")) return EMPTY;
        if (value.equals("MV\u53ef\u64ad")) return M_V;
        throw new IOException("Cannot deserialize TypeDesc");
    }
}
