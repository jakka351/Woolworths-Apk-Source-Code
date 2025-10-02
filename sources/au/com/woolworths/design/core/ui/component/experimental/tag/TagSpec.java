package au.com.woolworths.design.core.ui.component.experimental.tag;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@ExperimentalCoreDesignApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec;", "", "Size", "Icon", "IconPosition", "Style", "Tokens", "Image", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagSpec {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Icon;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Icon);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Icon(imageVector=null, position=null)";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$IconPosition;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IconPosition {
        public static final IconPosition d;
        public static final IconPosition e;
        public static final /* synthetic */ IconPosition[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            IconPosition iconPosition = new IconPosition("Leading", 0);
            d = iconPosition;
            IconPosition iconPosition2 = new IconPosition("Trailing", 1);
            e = iconPosition2;
            IconPosition[] iconPositionArr = {iconPosition, iconPosition2};
            f = iconPositionArr;
            g = EnumEntriesKt.a(iconPositionArr);
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image;", "", "LocalAsset", "RemoteAsset", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image$LocalAsset;", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image$RemoteAsset;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Image {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image$LocalAsset;", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LocalAsset implements Image {

            /* renamed from: a, reason: collision with root package name */
            public final String f4732a;

            public LocalAsset(String name) {
                Intrinsics.h(name, "name");
                this.f4732a = name;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image$RemoteAsset;", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Image;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RemoteAsset implements Image {

            /* renamed from: a, reason: collision with root package name */
            public final String f4733a;

            public RemoteAsset(String url) {
                Intrinsics.h(url, "url");
                this.f4733a = url;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Size;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Size {
        public static final Size g;
        public static final Size h;
        public static final /* synthetic */ Size[] i;
        public static final /* synthetic */ EnumEntries j;
        public final float d;
        public final float e;
        public final float f;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Size.Medium", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Size;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Medium extends Size {
            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Size
            public final TextStyle a(Composer composer) {
                composer.o(-694609487);
                TextStyle textStyle = CoreTheme.f(composer).f5120a.c.b;
                composer.l();
                return textStyle;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Size.Small", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Size;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Small extends Size {
            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Size
            public final TextStyle a(Composer composer) {
                composer.o(940780887);
                TextStyle textStyle = CoreTheme.f(composer).b.f5125a.f5126a;
                composer.l();
                return textStyle;
            }
        }

        static {
            Small small = new Small("Small", 0, Tokens.b, Tokens.d, Tokens.f);
            g = small;
            Medium medium = new Medium("Medium", 1, Tokens.f4734a, Tokens.c, Tokens.e);
            h = medium;
            Size[] sizeArr = {small, medium};
            i = sizeArr;
            j = EnumEntriesKt.a(sizeArr);
        }

        public Size(String str, int i2, float f, float f2, float f3) {
            this.d = f;
            this.e = f2;
            this.f = f3;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) i.clone();
        }

        public abstract TextStyle a(Composer composer);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Style {
        public static final Style d;
        public static final Style e;
        public static final Style f;
        public static final Style g;
        public static final Style h;
        public static final Style i;
        public static final Style j;
        public static final Style k;
        public static final Style l;
        public static final Style m;
        public static final /* synthetic */ Style[] n;
        public static final /* synthetic */ EnumEntries o;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Accent", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Accent extends Style {
            public Accent() {
                super("Accent", 10);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(793006162);
                long j = CoreTheme.b(composer).b.f4803a.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-650362538);
                long j = CoreTheme.b(composer).g.f4869a.f4870a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(1732648596);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Always", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Always extends Style {
            public Always() {
                super("Always", 2);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-394157966);
                long j = CoreTheme.a(composer).f4774a.f4777a.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-1837526666);
                long j = CoreTheme.a(composer).f4774a.f4777a.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(545484468);
                long j = CoreTheme.b(composer).e.d.c.b;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.AlwaysTint", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AlwaysTint extends Style {
            public AlwaysTint() {
                super("AlwaysTint", 3);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(1630067026);
                long j = CoreTheme.b(composer).g.f4869a.f4870a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-508459434);
                long j = CoreTheme.b(composer).g.f4869a.f4870a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(1394689428);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Info", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Info extends Style {
            public Info() {
                super("Info", 7);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-1995119790);
                long j = CoreTheme.b(composer).b.b.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(1335227990);
                long j = CoreTheme.b(composer).b.b.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(690758292);
                long j = CoreTheme.b(composer).e.d.c.b;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.InfoTint", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InfoTint extends Style {
            public InfoTint() {
                super("InfoTint", 8);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(895680754);
                long j = CoreTheme.b(composer).b.f4803a.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(1345507318);
                long j = CoreTheme.b(composer).b.f4803a.b;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(-546316748);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Nearby", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Nearby extends Style {
            public Nearby() {
                super("Nearby", 11);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(2053985906);
                long j = CoreTheme.b(composer).e.f4848a.e;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(610617206);
                long j = CoreTheme.b(composer).g.f4869a.f4870a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(-1301338956);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.New", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class New extends Style {
            public New() {
                super("New", 0);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-512792642);
                long j = CoreTheme.a(composer).f4774a.f4777a.f4778a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-1671337022);
                long j = CoreTheme.a(composer).f4774a.f4777a.f4778a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(2037485440);
                long j = CoreTheme.b(composer).e.d.c.b;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.PriceDropped", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PriceDropped extends Style {
            public PriceDropped() {
                super("PriceDropped", 5);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-1765424462);
                long j = CoreTheme.b(composer).e.f4848a.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(426266038);
                long j = CoreTheme.d(composer).f4872a.i;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(-1035321868);
                long j = CoreTheme.d(composer).f4872a.i;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Primary", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Primary extends Style {
            public Primary() {
                super("Primary", 9);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(2019293698);
                long j = CoreTheme.b(composer).b.b.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-2078557690);
                long j = CoreTheme.b(composer).b.b.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(-1222426684);
                long j = CoreTheme.b(composer).e.d.c.b;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Rewards", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Rewards extends Style {
            public Rewards() {
                super("Rewards", 4);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-476671034);
                long j = CoreTheme.a(composer).b.f4775a.f4776a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(-279555126);
                long j = CoreTheme.a(composer).b.f4775a.f4776a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(576575880);
                long j = CoreTheme.b(composer).e.d.c.b;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Special", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Special extends Style {
            public Special() {
                super("Special", 1);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(807143856);
                long j = CoreTheme.a(composer).f4774a.f4777a.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(1004259764);
                long j = CoreTheme.a(composer).f4774a.f4777a.c;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(1860390770);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/design/core/ui/component/experimental/tag/TagSpec.Style.Unavailable", "Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Style;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Unavailable extends Style {
            public Unavailable() {
                super("Unavailable", 6);
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long a(Composer composer) {
                composer.o(-799840994);
                long j = CoreTheme.d(composer).f4872a.f4874a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long b(Composer composer) {
                composer.o(1365565730);
                long j = CoreTheme.d(composer).f4872a.f4874a;
                composer.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec.Style
            public final long c(Composer composer) {
                composer.o(635554016);
                long j = CoreTheme.b(composer).e.d.d;
                composer.l();
                return j;
            }
        }

        static {
            New r0 = new New();
            d = r0;
            Special special = new Special();
            e = special;
            Always always = new Always();
            f = always;
            AlwaysTint alwaysTint = new AlwaysTint();
            g = alwaysTint;
            Rewards rewards = new Rewards();
            h = rewards;
            PriceDropped priceDropped = new PriceDropped();
            i = priceDropped;
            Unavailable unavailable = new Unavailable();
            j = unavailable;
            Info info = new Info();
            InfoTint infoTint = new InfoTint();
            k = infoTint;
            Primary primary = new Primary();
            l = primary;
            Accent accent = new Accent();
            m = accent;
            Style[] styleArr = {r0, special, always, alwaysTint, rewards, priceDropped, unavailable, info, infoTint, primary, accent, new Nearby()};
            n = styleArr;
            o = EnumEntriesKt.a(styleArr);
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) n.clone();
        }

        public abstract long a(Composer composer);

        public abstract long b(Composer composer);

        public abstract long c(Composer composer);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/tag/TagSpec$Tokens;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Tokens {

        /* renamed from: a, reason: collision with root package name */
        public static final float f4734a;
        public static final float b;
        public static final float c;
        public static final float d;
        public static final float e;
        public static final float f;

        static {
            float f2 = 4;
            f4734a = f2;
            float f3 = 2;
            b = f3;
            c = f2;
            d = f3;
            e = f2;
            f = f3;
        }
    }
}
