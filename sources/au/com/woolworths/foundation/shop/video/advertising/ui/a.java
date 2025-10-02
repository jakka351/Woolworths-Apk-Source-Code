package au.com.woolworths.foundation.shop.video.advertising.ui;

import android.os.Bundle;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ VideoAdBottomSheetFragment e;

    public /* synthetic */ a(VideoAdBottomSheetFragment videoAdBottomSheetFragment, int i) {
        this.d = i;
        this.e = videoAdBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Bundle arguments = this.e.getArguments();
                VideoAdBottomSheet videoAdBottomSheet = arguments != null ? (VideoAdBottomSheet) arguments.getParcelable("video_ad_bottom_sheet_extra") : null;
                if (videoAdBottomSheet != null) {
                    return videoAdBottomSheet;
                }
                throw new IllegalArgumentException("Video ad bottom sheet data is not provided");
            default:
                this.e.dismiss();
                return Unit.f24250a;
        }
    }
}
