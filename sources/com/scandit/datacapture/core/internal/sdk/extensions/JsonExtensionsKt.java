package com.scandit.datacapture.core.internal.sdk.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"bitmapByKey", "Landroid/graphics/Bitmap;", "Lcom/scandit/datacapture/core/json/JsonValue;", "key", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class JsonExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap bitmapByKey(@org.jetbrains.annotations.Nullable com.scandit.datacapture.core.json.JsonValue r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "key"
            kotlin.jvm.internal.Intrinsics.h(r5, r1)
            r1 = 0
            if (r4 != 0) goto Lb
            goto L67
        Lb:
            java.lang.String r2 = r4.getByKeyAsNullableString$scandit_capture_core(r5, r0)     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r2 = move-exception
            kotlin.Result$Failure r2 = kotlin.ResultKt.a(r2)
        L15:
            boolean r3 = r2 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L24
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L24
            android.graphics.Bitmap r2 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromBase64(r2)
            if (r2 == 0) goto L24
            return r2
        L24:
            com.scandit.datacapture.core.json.JsonValue r4 = r4.getByKeyAsObject(r5, r1)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L5a
            java.lang.String r5 = "type"
            java.lang.String r5 = r4.getByKeyAsNullableString$scandit_capture_core(r5, r1)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L5a
            java.lang.String r2 = "base64"
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            java.lang.String r5 = "data"
            java.lang.String r4 = r4.getByKeyAsString(r5, r0)     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r4 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromBase64(r4)     // Catch: java.lang.Throwable -> L45
            goto L60
        L45:
            r4 = move-exception
            goto L5c
        L47:
            java.lang.String r2 = "resource"
            boolean r5 = r5.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L5a
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.getByKeyAsString(r5, r0)     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r4 = com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt.bitmapFromResourceName(r4)     // Catch: java.lang.Throwable -> L45
            goto L60
        L5a:
            r4 = r1
            goto L60
        L5c:
            kotlin.Result$Failure r4 = kotlin.ResultKt.a(r4)
        L60:
            boolean r5 = r4 instanceof kotlin.Result.Failure
            if (r5 != 0) goto L67
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            return r4
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt.bitmapByKey(com.scandit.datacapture.core.json.JsonValue, java.lang.String):android.graphics.Bitmap");
    }
}
