// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//
//
// Import this package:
//
//     import com.hongbojiang.proxy.Converter;
//
// Then you can deserialize a JSON string with
//
//     SongDetail data = Converter.fromJsonString(jsonString);

package com.hongbojiang.proxy;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Converter {
    // Date-time helpers

    private static final String[] DATE_TIME_FORMATS = {
            "yyyy-MM-dd'T'HH:mm:ss.SX",
            "yyyy-MM-dd'T'HH:mm:ss.S",
            "yyyy-MM-dd'T'HH:mm:ssX",
            "yyyy-MM-dd'T'HH:mm:ss",
            "yyyy-MM-dd HH:mm:ss.SX",
            "yyyy-MM-dd HH:mm:ss.S",
            "yyyy-MM-dd HH:mm:ssX",
            "yyyy-MM-dd HH:mm:ss",
            "HH:mm:ss.SZ",
            "HH:mm:ss.S",
            "HH:mm:ssZ",
            "HH:mm:ss",
            "yyyy-MM-dd",
    };

    public static Date parseAllDateTimeString(String str) {
        for (String format : DATE_TIME_FORMATS) {
            try {
                return new SimpleDateFormat(format).parse(str);
            } catch (Exception ex) {
                // Ignored
            }
        }
        return null;
    }

    public static String serializeDateTime(Date datetime) {
        return new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ").format(datetime);
    }

    public static String serializeDate(Date datetime) {
        return new SimpleDateFormat("yyyy-MM-dd").format(datetime);
    }

    public static String serializeTime(Date datetime) {
        return new SimpleDateFormat("hh:mm:ssZ").format(datetime);
    }
    // Serialize/deserialize helpers

    public static PlaylistDetail getPlaylistDetailFromJsonString(String json) throws IOException {
        return getPlaylistReader().readValue(json);
    }

    public static SongDetail getSongDetailFromJsonString(String json) throws IOException {
        return getSongReader().readValue(json);
    }

    private static ObjectReader reader;

    private static ObjectReader instantiatePlaylistMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        return mapper.readerFor(PlaylistDetail.class);
    }

    private static ObjectReader instantiateSongMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        module.addDeserializer(Date.class, new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseAllDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        return mapper.readerFor(SongDetail.class);
    }

    private static ObjectReader getPlaylistReader() {
        return instantiatePlaylistMapper();
    }

    private static ObjectReader getSongReader() {
        return instantiateSongMapper();
    }
}
