package coil.compose;

import coil.ImageLoader;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "", "delegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcoil/ImageLoader;", "coil-compose-singleton_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ImageLoaderProvidableCompositionLocal {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/ImageLoader;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.compose.ImageLoaderProvidableCompositionLocal$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<ImageLoader> {
        public static final AnonymousClass1 h = new AnonymousClass1(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ImageLoaderProvidableCompositionLocal) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ImageLoaderProvidableCompositionLocal(delegate=null)";
    }
}
