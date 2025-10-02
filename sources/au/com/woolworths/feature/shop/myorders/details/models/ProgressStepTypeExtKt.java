package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shop.graphql.type.ProgressStepType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressStepTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressStepType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressStepType.Companion companion = ProgressStepType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressStepType.Companion companion2 = ProgressStepType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressStepType.Companion companion3 = ProgressStepType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final ProgressStepTypeApiData a(ProgressStepType progressStepType) {
        int iOrdinal = progressStepType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? ProgressStepTypeApiData.h : ProgressStepTypeApiData.g : ProgressStepTypeApiData.f : ProgressStepTypeApiData.e : ProgressStepTypeApiData.d;
    }
}
