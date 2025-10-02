package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes4.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String d;

    FileExtension(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
