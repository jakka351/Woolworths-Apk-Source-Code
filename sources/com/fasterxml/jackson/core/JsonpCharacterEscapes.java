package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class JsonpCharacterEscapes extends CharacterEscapes {
    static {
        int[] iArr = CharTypes.j;
        Arrays.copyOf(iArr, iArr.length);
        new SerializedString("\\u2028");
        new SerializedString("\\u2029");
    }
}
