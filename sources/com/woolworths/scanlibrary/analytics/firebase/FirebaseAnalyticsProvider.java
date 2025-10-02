package com.woolworths.scanlibrary.analytics.firebase;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.woolworths.scanlibrary.analytics.ActionTracking;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ScreenTracking;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/firebase/FirebaseAnalyticsProvider;", "Lcom/woolworths/scanlibrary/analytics/AnalyticsProvider;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FirebaseAnalyticsProvider implements AnalyticsProvider {
    public static final Regex b = new Regex("[\\s+,\\-.]");

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAnalytics f21138a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/firebase/FirebaseAnalyticsProvider$Companion;", "", "", "TAG", "Ljava/lang/String;", "Lkotlin/text/Regex;", "REPLACE_CHAR_REGEX", "Lkotlin/text/Regex;", "CHAR_UNDERSCORE", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseAnalyticsProvider(Context context) {
        Intrinsics.h(context, "context");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.g(firebaseAnalytics, "getInstance(...)");
        this.f21138a = firebaseAnalytics;
    }

    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void a(ScreenTracking screenTracking) {
    }

    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void b(ActionTracking actionTracking) {
        String str = actionTracking.f21135a;
        new StringBuilder("action = ").append(str);
        Regex regex = b;
        String strG = regex.g(str, "_");
        Map map = actionTracking.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(regex.g((String) entry.getKey(), "_"), entry.getValue()));
        }
        Map mapP = MapsKt.p(arrayList);
        Bundle bundle = new Bundle();
        for (Map.Entry entry2 : mapP.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str2, ((Number) value).intValue());
            } else if (value instanceof int[]) {
                bundle.putIntArray(str2, (int[]) value);
            } else if (value instanceof Character) {
                bundle.putChar(str2, ((Character) value).charValue());
            } else if (value instanceof char[]) {
                bundle.putCharArray(str2, (char[]) value);
            } else if (value instanceof Byte) {
                bundle.putByte(str2, ((Number) value).byteValue());
            } else if (value instanceof byte[]) {
                bundle.putByteArray(str2, (byte[]) value);
            } else if (value instanceof Float) {
                bundle.putFloat(str2, ((Number) value).floatValue());
            } else if (value instanceof float[]) {
                bundle.putFloatArray(str2, (float[]) value);
            } else if (value instanceof Short) {
                bundle.putShort(str2, ((Number) value).shortValue());
            } else if (value instanceof short[]) {
                bundle.putShortArray(str2, (short[]) value);
            } else if (value instanceof String) {
                bundle.putString(str2, (String) value);
            } else if (value instanceof Bundle) {
                bundle.putBundle(str2, (Bundle) value);
            } else if (value instanceof Parcelable) {
                bundle.putParcelable(str2, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(str2, (Serializable) value);
            }
        }
        this.f21138a.f15179a.zzh(strG, bundle);
    }
}
