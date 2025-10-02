package au.com.woolworths.feature.shop.healthylifefoodtracker;

import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadableAssetTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DownloadableAssetType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DownloadableAssetType.Companion companion = DownloadableAssetType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final au.com.woolworths.android.onesite.data.DownloadableAssetType a(DownloadableAssetType downloadableAssetType) {
        Intrinsics.h(downloadableAssetType, "<this>");
        int iOrdinal = downloadableAssetType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? au.com.woolworths.android.onesite.data.DownloadableAssetType.d : au.com.woolworths.android.onesite.data.DownloadableAssetType.IMAGE : au.com.woolworths.android.onesite.data.DownloadableAssetType.LOTTIE_ANIMATION;
    }
}
