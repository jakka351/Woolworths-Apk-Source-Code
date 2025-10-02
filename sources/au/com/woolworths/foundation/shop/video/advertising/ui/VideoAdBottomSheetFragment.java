package au.com.woolworths.foundation.shop.video.advertising.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/ui/VideoAdBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoAdBottomSheetFragment extends BottomSheetDialogFragment {
    public final Lazy d = LazyKt.b(new a(this, 0));
    public final MutableState e = SnapshotStateKt.f(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/ui/VideoAdBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "VIDEO_AD_BOTTOM_SHEET_EXTRA", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static VideoAdBottomSheetFragment a(VideoAdBottomSheet extra) {
            Intrinsics.h(extra, "extra");
            VideoAdBottomSheetFragment videoAdBottomSheetFragment = new VideoAdBottomSheetFragment();
            videoAdBottomSheetFragment.setCancelable(true);
            videoAdBottomSheetFragment.setArguments(BundleKt.a(new Pair("video_ad_bottom_sheet_extra", extra)));
            return videoAdBottomSheetFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final VideoAdBottomSheetFragment videoAdBottomSheetFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-669649665, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                VideoAdBottomSheetFragment videoAdBottomSheetFragment2 = videoAdBottomSheetFragment;
                                VideoAdBottomSheet videoAdBottomSheet = (VideoAdBottomSheet) videoAdBottomSheetFragment2.d.getD();
                                boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) videoAdBottomSheetFragment2.e).getD()).booleanValue();
                                composer2.o(5004770);
                                boolean zI = composer2.I(videoAdBottomSheetFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(videoAdBottomSheetFragment2, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                VideoAdBottomSheetUiKt.b(videoAdBottomSheet, zBooleanValue, (Function0) objG, null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -689733413));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment$onViewCreated$layoutListener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                final VideoAdBottomSheetFragment videoAdBottomSheetFragment = this;
                Dialog dialog = videoAdBottomSheetFragment.getDialog();
                BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
                View viewFindViewById = bottomSheetDialog != null ? bottomSheetDialog.findViewById(R.id.design_bottom_sheet) : null;
                if (viewFindViewById != null) {
                    BottomSheetBehavior.F(viewFindViewById).y(new BottomSheetBehavior.BottomSheetCallback() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetFragment$registerForBottomSheetCallback$1
                        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                        public final void b(View view2, float f) {
                        }

                        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
                        public final void c(int i, View view2) {
                            ((SnapshotMutableStateImpl) videoAdBottomSheetFragment.e).setValue(Boolean.valueOf(i == 3));
                        }
                    });
                }
            }
        });
    }
}
