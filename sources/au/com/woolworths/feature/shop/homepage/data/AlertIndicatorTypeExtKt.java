package au.com.woolworths.feature.shop.homepage.data;

import au.com.woolworths.shop.graphql.type.AlertIndicatorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlertIndicatorTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7179a;

        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.AlertIndicatorType.values().length];
            try {
                AlertIndicatorType.Companion companion = au.com.woolworths.shop.graphql.type.AlertIndicatorType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7179a = iArr;
        }
    }

    public static final void a(au.com.woolworths.shop.graphql.type.AlertIndicatorType alertIndicatorType) {
        AlertIndicatorType alertIndicatorType2 = AlertIndicatorType.d;
        Intrinsics.h(alertIndicatorType, "<this>");
        int i = WhenMappings.f7179a[alertIndicatorType.ordinal()];
    }
}
