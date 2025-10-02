package com.salesforce.marketingcloud.messages.iam;

import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.salesforce.marketingcloud.messages.iam.InAppMessage.Button> a(@org.jetbrains.annotations.NotNull org.json.JSONArray r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.h.a(org.json.JSONArray):java.util.List");
    }

    @VisibleForTesting
    @NotNull
    public static final InAppMessage.Media b(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        String string = jSONObject.getString("url");
        Intrinsics.g(string, "getString(...)");
        InAppMessage.Media.ImageSize imageSizeValueOf = InAppMessage.Media.ImageSize.e2e;
        String strI = com.google.android.gms.common.api.internal.a.i(jSONObject, "size", "optString(...)");
        if (strI != null) {
            imageSizeValueOf = InAppMessage.Media.ImageSize.valueOf(strI);
        }
        InAppMessage.Media.ImageSize imageSize = imageSizeValueOf;
        String strI2 = com.google.android.gms.common.api.internal.a.i(jSONObject, "altText", "optString(...)");
        InAppMessage.Size sizeValueOf = InAppMessage.Size.s;
        String strI3 = com.google.android.gms.common.api.internal.a.i(jSONObject, "borderWidth", "optString(...)");
        InAppMessage.Size sizeValueOf2 = strI3 != null ? InAppMessage.Size.valueOf(strI3) : sizeValueOf;
        String strI4 = com.google.android.gms.common.api.internal.a.i(jSONObject, "borderColor", "optString(...)");
        String strI5 = com.google.android.gms.common.api.internal.a.i(jSONObject, "cornerRadius", "optString(...)");
        if (strI5 != null) {
            sizeValueOf = InAppMessage.Size.valueOf(strI5);
        }
        return new InAppMessage.Media(string, imageSize, strI2, sizeValueOf2, strI4, sizeValueOf);
    }

    @VisibleForTesting
    @NotNull
    public static final InAppMessage.TextField c(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.h(jSONObject, "<this>");
        String string = jSONObject.getString(TextBundle.TEXT_ENTRY);
        Intrinsics.g(string, "getString(...)");
        InAppMessage.Size sizeValueOf = InAppMessage.Size.s;
        String strI = com.google.android.gms.common.api.internal.a.i(jSONObject, "fontSize", "optString(...)");
        if (strI != null) {
            sizeValueOf = InAppMessage.Size.valueOf(strI);
        }
        String strI2 = com.google.android.gms.common.api.internal.a.i(jSONObject, "fontColor", "optString(...)");
        InAppMessage.Alignment alignmentValueOf = InAppMessage.Alignment.center;
        String strI3 = com.google.android.gms.common.api.internal.a.i(jSONObject, "alignment", "optString(...)");
        if (strI3 != null) {
            alignmentValueOf = InAppMessage.Alignment.valueOf(strI3);
        }
        return new InAppMessage.TextField(string, sizeValueOf, strI2, alignmentValueOf);
    }

    @NotNull
    public static final InAppMessage.CloseButton a(@NotNull JSONObject jSONObject) {
        Intrinsics.h(jSONObject, "<this>");
        InAppMessage.Alignment alignmentValueOf = InAppMessage.Alignment.end;
        String strI = com.google.android.gms.common.api.internal.a.i(jSONObject, "alignment", "optString(...)");
        if (strI != null) {
            alignmentValueOf = InAppMessage.Alignment.valueOf(strI);
        }
        return new InAppMessage.CloseButton(alignmentValueOf);
    }
}
