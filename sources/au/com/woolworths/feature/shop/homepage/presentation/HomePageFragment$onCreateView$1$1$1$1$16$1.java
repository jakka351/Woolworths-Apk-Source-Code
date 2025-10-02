package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$onCreateView$1$1$1$1$16$1 extends FunctionReferenceImpl implements Function1<VideoAdBottomSheet, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VideoAdBottomSheet p0 = (VideoAdBottomSheet) obj;
        Intrinsics.h(p0, "p0");
        HomePageFragment homePageFragment = (HomePageFragment) this.receiver;
        homePageFragment.getClass();
        VideoAdBottomSheetFragment.Companion.a(p0).show(homePageFragment.getParentFragmentManager(), "VideoAdBottomSheetFragment");
        return Unit.f24250a;
    }
}
