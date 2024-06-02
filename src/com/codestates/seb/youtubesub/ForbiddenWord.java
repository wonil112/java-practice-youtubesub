package com.codestates.seb.youtubesub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ForbiddenWord {

    private static final HashMap<String, String> forbiddenWordMap = new HashMap<>() {{
        put("씨발", "아이좋아");
        put("존나", "매우많이");
        put("개새끼", "귀여운아이");
        put("병신", "착한아이");
        put("좆", "사랑");
    }};

    public static HashMap<String, String> getForbiddenWordMap() {
        return forbiddenWordMap;
    }
}

