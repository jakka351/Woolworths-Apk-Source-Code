package androidx.media3.extractor;

import android.view.MenuItem;
import android.view.View;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.CuesWithTimingSubtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutPaymentState;
import au.com.woolworths.android.onesite.modules.main.MainActivity;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.feature.product.list.ProductListOptionsController;
import au.com.woolworths.feature.product.list.legacy.ProductListController;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, ExtractorsFactory, Id3Decoder.FramePredicate, Function, CallbackToFutureAdapter.Resolver, OnApplyWindowInsetsListener, io.reactivex.functions.Function, BottomNavigationView.OnNavigationItemReselectedListener, EpoxyModel.SpanSizeOverrideCallback {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    public int a(int i, int i2, int i3) {
        switch (this.d) {
            case 24:
                return ProductListOptionsController.buildFilterCard$lambda$10$lambda$9(i, i2, i3);
            case 25:
                return ProductListOptionsController.buildMarketplaceSwitch$lambda$16$lambda$11(i, i2, i3);
            case 26:
                return ProductListOptionsController.buildModels$lambda$4$lambda$1$lambda$0(i, i2, i3);
            case 27:
                return ProductListOptionsController.buildModels$lambda$4$lambda$3$lambda$2(i, i2, i3);
            case 28:
                return ProductListController.buildErrorState$lambda$23(i, i2, i3);
            default:
                return ProductListController.buildVideoAdUnit$lambda$13$lambda$12(i, i2, i3);
        }
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        switch (this.d) {
            case 7:
                Track track = (Track) obj;
                int i = Mp4Extractor.G;
                return track;
            case 10:
                Ordering ordering = CuesWithTimingSubtitle.f;
                long j = ((CuesWithTiming) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 19:
                Throwable t = (Throwable) obj;
                Intrinsics.h(t, "t");
                return new CheckoutPaymentState(null, t, 1);
            case 20:
                Throwable it = (Throwable) obj;
                Intrinsics.h(it, "it");
                Timber.f27013a.p(it);
                return Result.Companion.a(new IllegalStateException("Failed to get Merchant Profile"));
            case 21:
                Throwable throwable = (Throwable) obj;
                Intrinsics.h(throwable, "throwable");
                Timber.f27013a.p(throwable);
                return Result.Companion.a(throwable);
            default:
                Throwable throwable2 = (Throwable) obj;
                Intrinsics.h(throwable2, "throwable");
                return Result.Companion.a(throwable2);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        completer.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] c() {
        int i = this.d;
        SubtitleParser.Factory factory = SubtitleParser.Factory.f3355a;
        switch (i) {
            case 2:
                return new Extractor[]{new AmrExtractor()};
            case 3:
                return new Extractor[]{new FlacExtractor()};
            case 4:
                return new Extractor[]{new FlvExtractor()};
            case 5:
            case 6:
            case 7:
            case 10:
            default:
                return new Extractor[]{new WavExtractor()};
            case 8:
                return new Extractor[]{new Mp4Extractor(factory, 16)};
            case 9:
                return new Extractor[]{new OggExtractor()};
            case 11:
                return new Extractor[]{new Ac3Extractor()};
            case 12:
                return new Extractor[]{new Ac4Extractor()};
            case 13:
                return new Extractor[]{new AdtsExtractor()};
            case 14:
                return new Extractor[]{new PsExtractor()};
            case 15:
                return new Extractor[]{new TsExtractor(1, factory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(ImmutableList.t()))};
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener
    public void d(MenuItem it) {
        MainContract.MainPage mainPage = MainActivity.R;
        Intrinsics.h(it, "it");
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor e() {
        switch (this.d) {
            case 0:
                int[] iArr = DefaultExtractorsFactory.h;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = DefaultExtractorsFactory.h;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(null);
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean f(int i, int i2, int i3, int i4, int i5) {
        switch (this.d) {
            case 5:
                break;
            default:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.h(v, "v");
        Insets insetsE = windowInsetsCompat.e(655);
        Intrinsics.g(insetsE, "getInsets(...)");
        v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), insetsE.d);
        return WindowInsetsCompat.b;
    }
}
