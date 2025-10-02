package au.com.woolworths.design.core.ui.component.stable.corerow;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.design.core.ui.component.experimental.badge.BadgeVariant;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec;", "", "Image", "ImageSize", "DividerType", "TrailingDisplay", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreRowSpec {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$DividerType;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DividerType {
        public static final DividerType d;
        public static final DividerType e;
        public static final DividerType f;
        public static final /* synthetic */ DividerType[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            DividerType dividerType = new DividerType("None", 0);
            d = dividerType;
            DividerType dividerType2 = new DividerType("FullWidth", 1);
            e = dividerType2;
            DividerType dividerType3 = new DividerType("IndentToLabelEdge", 2);
            f = dividerType3;
            DividerType[] dividerTypeArr = {dividerType, dividerType2, dividerType3};
            g = dividerTypeArr;
            h = EnumEntriesKt.a(dividerTypeArr);
        }

        public static DividerType valueOf(String str) {
            return (DividerType) Enum.valueOf(DividerType.class, str);
        }

        public static DividerType[] values() {
            return (DividerType[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$ImageSize;", "", "Companion", "dp", "Landroidx/compose/ui/unit/Dp;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class ImageSize {

        /* renamed from: a, reason: collision with root package name */
        public static final float f4756a = 24;
        public static final float b = 40;
        public static final float c = 64;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$ImageSize$Companion;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ImageSize) && Dp.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        }

        public final String toString() {
            return YU.a.h("ImageSize(dp=", Dp.b(BitmapDescriptorFactory.HUE_RED), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay;", "", "Text", "Badge", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay$Badge;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay$Text;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TrailingDisplay {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay$Badge;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Badge implements TrailingDisplay {
            public Badge() {
                BadgeVariant[] badgeVariantArr = BadgeVariant.d;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay$Text;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$TrailingDisplay;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Text implements TrailingDisplay {

            /* renamed from: a, reason: collision with root package name */
            public final String f4757a;

            public Text(String text) {
                Intrinsics.h(text, "text");
                this.f4757a = text;
            }
        }
    }

    public static ComposableLambdaImpl a(final Image image) {
        if (image instanceof Image.LocalImage) {
            return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$toComposable$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        CoreRowSpec.Image.LocalImage localImage = (CoreRowSpec.Image.LocalImage) image;
                        IconKt.b(localImage.f4754a, null, SizeKt.q(Modifier.Companion.d, localImage.c), ((Color) localImage.b.invoke(composer, 0)).f1766a, composer, 48, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 2047875656);
        }
        if (image instanceof Image.RemoteImage) {
            return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$toComposable$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        CoreRowSpec.Image.RemoteImage remoteImage = (CoreRowSpec.Image.RemoteImage) image;
                        Modifier modifierQ = SizeKt.q(Modifier.Companion.d, remoteImage.c);
                        String str = remoteImage.f4755a;
                        Painter painter = remoteImage.b;
                        SingletonAsyncImageKt.b(str, null, modifierQ, painter, painter, null, null, null, null, null, ContentScale.Companion.b, null, composer, 48, 6, 31712);
                    }
                    return Unit.f24250a;
                }
            }, true, -55158991);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image;", "", "LocalImage", "RemoteImage", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image$LocalImage;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image$RemoteImage;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Image {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image$LocalImage;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LocalImage implements Image {

            /* renamed from: a, reason: collision with root package name */
            public final ImageVector f4754a;
            public final Function2 b;
            public final float c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec$Image$LocalImage$1, reason: invalid class name */
            final class AnonymousClass1 implements Function2<Composer, Integer, Color> {
                public static final AnonymousClass1 d = new AnonymousClass1();

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    ((Number) obj2).intValue();
                    composer.o(-1414569310);
                    long j = CoreTheme.b(composer).e.c.b;
                    composer.l();
                    return new Color(j);
                }
            }

            public LocalImage(ImageVector icon, Function2 tint, float f) {
                Intrinsics.h(icon, "icon");
                Intrinsics.h(tint, "tint");
                this.f4754a = icon;
                this.b = tint;
                this.c = f;
            }

            public LocalImage(ImageVector imageVector, Function2 function2, float f, int i) {
                this(imageVector, (i & 2) != 0 ? AnonymousClass1.d : function2, (i & 4) != 0 ? ImageSize.f4756a : f);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image$RemoteImage;", "Lau/com/woolworths/design/core/ui/component/stable/corerow/CoreRowSpec$Image;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RemoteImage implements Image {

            /* renamed from: a, reason: collision with root package name */
            public final String f4755a;
            public final Painter b;
            public final float c;

            public RemoteImage(String iconUrl, Painter painter, float f) {
                Intrinsics.h(iconUrl, "iconUrl");
                this.f4755a = iconUrl;
                this.b = painter;
                this.c = f;
            }

            public RemoteImage(String str, Painter painter, float f, int i) {
                this(str, (i & 2) != 0 ? null : painter, (i & 4) != 0 ? ImageSize.b : f);
            }
        }
    }
}
