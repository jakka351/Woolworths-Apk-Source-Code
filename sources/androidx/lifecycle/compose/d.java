package androidx.lifecycle.compose;

import android.os.StatFs;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import au.com.woolworths.android.onesite.app.BaseShopApplication;
import au.com.woolworths.android.onesite.app.BaseShopApplication$newImageLoader$lambda$10$lambda$9$$inlined$addNetworkInterceptor$1;
import au.com.woolworths.design.core.ui.foundation.CoreThemeDefaults;
import au.com.woolworths.design.core.ui.foundation.CoreThemeDefaultsKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.color.CoreThemeColorsKt;
import au.com.woolworths.design.core.ui.foundation.elevation.LocalCoreElevationKt;
import au.com.woolworths.design.core.ui.foundation.icon.LocalCoreIconsKt;
import au.com.woolworths.design.core.ui.foundation.typography.CoreTypographyKt;
import au.com.woolworths.design.wx.foundation.ColorSchemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.TypeKt;
import coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$3$$inlined$sortedByDescending$1;
import coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$6$$inlined$sortedByDescending$1;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.compose.LocalAsyncImageModelEqualityDelegateKt;
import coil3.disk.DiskCache;
import coil3.disk.RealDiskCache;
import coil3.disk.UtilsKt;
import coil3.network.CacheStrategy;
import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import coil3.util.Collections_jvmCommonKt;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.FetcherServiceLoaderTarget;
import coil3.util.ServiceLoaderComponentRegistry;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.OkHttpClient;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jE;
        int i = 0;
        switch (this.d) {
            case 0:
                ProvidableCompositionLocal providableCompositionLocal = LocalLifecycleOwnerKt.f2808a;
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                int i2 = BaseShopApplication.i;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.d.add(new BaseShopApplication$newImageLoader$lambda$10$lambda$9$$inlined$addNetworkInterceptor$1());
                return new OkHttpClient(builder);
            case 2:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CoreThemeKt.f4773a;
                return CoreThemeDefaults.g;
            case 3:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CoreThemeColorsKt.f4871a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.f4772a;
            case 4:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CoreThemeColorsKt.f4871a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.b;
            case 5:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = CoreThemeColorsKt.f4871a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.c;
            case 6:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = LocalCoreElevationKt.f4878a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.f;
            case 7:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal6 = LocalCoreIconsKt.f4894a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.e;
            case 8:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal7 = CoreTypographyKt.f5119a;
                CoreThemeDefaultsKt.a();
                return CoreThemeDefaults.d;
            case 9:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal8 = ColorSchemeKt.f5155a;
                throw new IllegalStateException("No ColorScheme provided");
            case 10:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal9 = ThemeKt.f5160a;
                throw new IllegalStateException("No ThemeContext provided");
            case 11:
                return TypeKt.f5163a;
            case 12:
                return Boolean.FALSE;
            case 13:
                return (DiskCache) UtilsKt.f13089a.getD();
            case 14:
                List listU0 = CollectionsKt.u0(new RealImageLoaderKt$addServiceLoaderComponents$lambda$3$$inlined$sortedByDescending$1(), (List) ServiceLoaderComponentRegistry.f13155a.getD());
                ArrayList arrayList = new ArrayList();
                int size = listU0.size();
                while (i < size) {
                    FetcherServiceLoaderTarget fetcherServiceLoaderTarget = (FetcherServiceLoaderTarget) listU0.get(i);
                    Intrinsics.f(fetcherServiceLoaderTarget, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    NetworkFetcher.Factory factoryB = fetcherServiceLoaderTarget.b();
                    KClass kClassType = fetcherServiceLoaderTarget.type();
                    Pair pair = kClassType == null ? null : new Pair(factoryB, kClassType);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i++;
                }
                return arrayList;
            case 15:
                List listU02 = CollectionsKt.u0(new RealImageLoaderKt$addServiceLoaderComponents$lambda$6$$inlined$sortedByDescending$1(), (List) ServiceLoaderComponentRegistry.b.getD());
                ArrayList arrayList2 = new ArrayList();
                int size2 = listU02.size();
                while (i < size2) {
                    arrayList2.add(((DecoderServiceLoaderTarget) listU02.get(i)).a());
                    i++;
                }
                return arrayList2;
            case 16:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal10 = LocalAsyncImageModelEqualityDelegateKt.f13065a;
                return AsyncImageModelEqualityDelegate.f13057a;
            case 17:
                Lazy lazy = UtilsKt.f13089a;
                DiskCache.Builder builder2 = new DiskCache.Builder();
                builder2.f13084a = FileSystem.d;
                builder2.b = 10485760L;
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                builder2.c = DefaultIoScheduler.f;
                Path pathE = FileSystem.e.e("coil3_disk_cache");
                try {
                    File file = pathE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jE = RangesKt.e((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                    jE = builder2.b;
                }
                return new RealDiskCache(jE, builder2.c, builder2.f13084a, pathE);
            case 18:
                return CacheStrategy.f13121a;
            case 19:
                return new CallFactoryNetworkClient(new OkHttpClient());
            case 20:
                Lazy lazy2 = ServiceLoaderComponentRegistry.f13155a;
                return Collections_jvmCommonKt.a(SequencesKt.x(SequencesKt.b(ServiceLoader.load(FetcherServiceLoaderTarget.class, FetcherServiceLoaderTarget.class.getClassLoader()).iterator())));
            case 21:
                Lazy lazy3 = ServiceLoaderComponentRegistry.f13155a;
                return Collections_jvmCommonKt.a(SequencesKt.x(SequencesKt.b(ServiceLoader.load(DecoderServiceLoaderTarget.class, DecoderServiceLoaderTarget.class.getClassLoader()).iterator())));
            default:
                Lazy lazy4 = OkHttpExtensionsKt.f13624a;
                return new OkHttpClient.Builder();
        }
    }
}
