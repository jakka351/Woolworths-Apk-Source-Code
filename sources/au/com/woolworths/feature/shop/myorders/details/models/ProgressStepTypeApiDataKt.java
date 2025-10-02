package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressStepTypeApiDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressStepTypeApiData.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressStepTypeApiData progressStepTypeApiData = ProgressStepTypeApiData.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressStepTypeApiData progressStepTypeApiData2 = ProgressStepTypeApiData.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressStepTypeApiData progressStepTypeApiData3 = ProgressStepTypeApiData.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ProgressStepTypeApiData progressStepTypeApiData4 = ProgressStepTypeApiData.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final ProgressStepType a(ProgressStepTypeApiData progressStepTypeApiData) {
        int iOrdinal = progressStepTypeApiData.ordinal();
        if (iOrdinal == 0) {
            return ProgressStepType.d;
        }
        if (iOrdinal == 1) {
            return ProgressStepType.e;
        }
        if (iOrdinal == 2) {
            return ProgressStepType.f;
        }
        if (iOrdinal == 3) {
            return ProgressStepType.g;
        }
        if (iOrdinal == 4) {
            return ProgressStepType.h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
