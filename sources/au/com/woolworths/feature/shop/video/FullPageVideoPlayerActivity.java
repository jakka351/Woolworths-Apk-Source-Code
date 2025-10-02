package au.com.woolworths.feature.shop.video;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.video.FullPageVideoPlayerContract;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/video/FullPageVideoPlayerActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FullPageVideoPlayerActivity extends Hilt_FullPageVideoPlayerActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(FullPageVideoPlayerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final FullPageVideoPlayerViewModel N4() {
        return (FullPageVideoPlayerViewModel) this.w.getD();
    }

    public final void O4(long j, String str) {
        Intent intent = new Intent();
        VideoData videoData = ((FullPageVideoPlayerContract.ViewState) N4().h.getValue()).f8214a;
        Intrinsics.e(videoData);
        String id = videoData.getId();
        if (id == null) {
            id = videoData.getUrl();
        }
        setResult(-1, intent.putExtra("RESULT_KEY", new Activities.FullPageVideoPlayerActivity.Result(id, j, str)));
        finish();
    }

    @Override // au.com.woolworths.feature.shop.video.Hilt_FullPageVideoPlayerActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("FullPageVideo");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException(("No video data passed in to " + this).toString());
        }
        Activities.FullPageVideoPlayerActivity.Extras extras = (Activities.FullPageVideoPlayerActivity.Extras) parcelableExtra;
        EdgeToEdge.b(this);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.f();
        windowInsetsControllerCompat.a(519);
        FullPageVideoPlayerViewModel fullPageVideoPlayerViewModelN4 = N4();
        VideoData videoData = new VideoData(extras.d, extras.e, extras.f, extras.g, extras.h);
        fullPageVideoPlayerViewModelN4.i = videoData;
        fullPageVideoPlayerViewModelN4.g.setValue(new FullPageVideoPlayerContract.ViewState(videoData, extras.i));
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity.onCreate.2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final FullPageVideoPlayerActivity fullPageVideoPlayerActivity = FullPageVideoPlayerActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1978861212, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity.onCreate.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = FullPageVideoPlayerActivity.x;
                                FullPageVideoPlayerActivity fullPageVideoPlayerActivity2 = fullPageVideoPlayerActivity;
                                MutableState mutableStateA = SnapshotStateKt.a(fullPageVideoPlayerActivity2.N4().h, composer2);
                                FullPageVideoPlayerViewModel fullPageVideoPlayerViewModelN42 = fullPageVideoPlayerActivity2.N4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(fullPageVideoPlayerViewModelN42);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    FullPageVideoPlayerActivity$onCreate$2$1$1$1 fullPageVideoPlayerActivity$onCreate$2$1$1$1 = new FullPageVideoPlayerActivity$onCreate$2$1$1$1(3, fullPageVideoPlayerViewModelN42, FullPageVideoPlayerViewModel.class, "updateVideoProgress", "updateVideoProgress(ZJJ)V", 0);
                                    composer2.A(fullPageVideoPlayerActivity$onCreate$2$1$1$1);
                                    objG = fullPageVideoPlayerActivity$onCreate$2$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                FullPageVideoPlayerViewModel fullPageVideoPlayerViewModelN43 = fullPageVideoPlayerActivity2.N4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(fullPageVideoPlayerViewModelN43);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    FullPageVideoPlayerActivity$onCreate$2$1$2$1 fullPageVideoPlayerActivity$onCreate$2$1$2$1 = new FullPageVideoPlayerActivity$onCreate$2$1$2$1(0, fullPageVideoPlayerViewModelN43, FullPageVideoPlayerViewModel.class, "onVideoPlayFromStart", "onVideoPlayFromStart()V", 0);
                                    composer2.A(fullPageVideoPlayerActivity$onCreate$2$1$2$1);
                                    objG2 = fullPageVideoPlayerActivity$onCreate$2$1$2$1;
                                }
                                composer2.l();
                                Function3 function3 = (Function3) kFunction;
                                Function0 function0 = (Function0) ((KFunction) objG2);
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(fullPageVideoPlayerActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(fullPageVideoPlayerActivity2, 13);
                                    composer2.A(objG3);
                                }
                                Function2 function2 = (Function2) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(fullPageVideoPlayerActivity2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    objG4 = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(fullPageVideoPlayerActivity2, 16);
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                VideoScreenKt.a(mutableStateA, function3, function0, function2, (Function0) objG4, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1843309996));
    }
}
