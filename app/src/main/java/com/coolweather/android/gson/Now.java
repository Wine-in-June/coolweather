package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "now":{
 *     "tmp":"29",
 *     "cond":{
 *         "txt":"阵雨"
 *     }
 * }
 */
public class Now {
    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

