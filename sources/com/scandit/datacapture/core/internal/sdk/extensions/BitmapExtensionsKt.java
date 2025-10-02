package com.scandit.datacapture.core.internal.sdk.extensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001¨\u0006\t"}, d2 = {"bitmapFromBase64", "Landroid/graphics/Bitmap;", "", "bitmapFromResource", "", "bitmapFromResourceName", "toBase64", "toJpeg", "", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BitmapExtensionsKt {
    @Nullable
    public static final Bitmap bitmapFromBase64(@NotNull String str) {
        Object objA;
        Intrinsics.h(str, "<this>");
        if (StringsKt.D(str)) {
            return null;
        }
        try {
            int iC = StringsKt.C(str, ",", 0, false, 6);
            if (iC >= 0) {
                str = StringsKt.M(iC, str).toString();
            }
            byte[] bArrDecode = Base64.decode(str, 2);
            objA = bArrDecode != null ? BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length) : null;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        return (Bitmap) (objA instanceof Result.Failure ? null : objA);
    }

    @NotNull
    public static final Bitmap bitmapFromResource(int i) {
        return ContextExtensionsKt.getBitmap(AppAndroidEnvironment.INSTANCE.getApplicationContext(), i);
    }

    @SuppressLint
    @NotNull
    public static final Bitmap bitmapFromResourceName(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        Context applicationContext = appAndroidEnvironment.getApplicationContext();
        return ContextExtensionsKt.getBitmap(appAndroidEnvironment.getApplicationContext(), applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName()));
    }

    @NotNull
    public static final String toBase64(@NotNull Bitmap bitmap) throws IOException {
        Intrinsics.h(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.g(strEncodeToString, "encodeToString(byteArray…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        } finally {
        }
    }

    @NotNull
    public static final byte[] toJpeg(@NotNull Bitmap bitmap) throws IOException {
        Intrinsics.h(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.g(byteArray, "byteArrayOutputStream.toByteArray()");
            return byteArray;
        } finally {
        }
    }
}
