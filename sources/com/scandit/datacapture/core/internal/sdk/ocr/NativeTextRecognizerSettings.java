package com.scandit.datacapture.core.internal.sdk.ocr;

import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeTextRecognizerSettings {
    final String charWhiteList;
    final boolean combineCapturedTextsIntoSingleResult;
    final ArrayList<String> fonts;
    final float maximumLineHeight;
    final float minimumLineHeight;

    public NativeTextRecognizerSettings(String str, ArrayList<String> arrayList, float f, float f2, boolean z) {
        this.charWhiteList = str;
        this.fonts = arrayList;
        this.minimumLineHeight = f;
        this.maximumLineHeight = f2;
        this.combineCapturedTextsIntoSingleResult = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeTextRecognizerSettings)) {
            return false;
        }
        NativeTextRecognizerSettings nativeTextRecognizerSettings = (NativeTextRecognizerSettings) obj;
        return this.charWhiteList.equals(nativeTextRecognizerSettings.charWhiteList) && this.fonts.equals(nativeTextRecognizerSettings.fonts) && this.minimumLineHeight == nativeTextRecognizerSettings.minimumLineHeight && this.maximumLineHeight == nativeTextRecognizerSettings.maximumLineHeight && this.combineCapturedTextsIntoSingleResult == nativeTextRecognizerSettings.combineCapturedTextsIntoSingleResult;
    }

    public String getCharWhiteList() {
        return this.charWhiteList;
    }

    public boolean getCombineCapturedTextsIntoSingleResult() {
        return this.combineCapturedTextsIntoSingleResult;
    }

    public ArrayList<String> getFonts() {
        return this.fonts;
    }

    public float getMaximumLineHeight() {
        return this.maximumLineHeight;
    }

    public float getMinimumLineHeight() {
        return this.minimumLineHeight;
    }

    public int hashCode() {
        return a.a(this.maximumLineHeight, a.a(this.minimumLineHeight, a.b(b.c(527, 31, this.charWhiteList), 31, this.fonts), 31), 31) + (this.combineCapturedTextsIntoSingleResult ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeTextRecognizerSettings{charWhiteList=");
        sb.append(this.charWhiteList);
        sb.append(",fonts=");
        sb.append(this.fonts);
        sb.append(",minimumLineHeight=");
        sb.append(this.minimumLineHeight);
        sb.append(",maximumLineHeight=");
        sb.append(this.maximumLineHeight);
        sb.append(",combineCapturedTextsIntoSingleResult=");
        return YU.a.k("}", sb, this.combineCapturedTextsIntoSingleResult);
    }
}
