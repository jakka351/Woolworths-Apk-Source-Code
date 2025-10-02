package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec;", "", "Size", "Variant", "Tokens", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonSpec {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Size;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size g;
        public static final Size h;
        public static final /* synthetic */ Size[] i;
        public static final /* synthetic */ EnumEntries j;
        public final float d;
        public final float e;
        public final float f;

        static {
            float f = Tokens.f4749a;
            Size size = new Size("Medium", 0, Tokens.c, Tokens.f, Tokens.h);
            g = size;
            Size size2 = new Size("Small", 1, Tokens.d, Tokens.g, Tokens.i);
            h = size2;
            Size[] sizeArr = {size, size2};
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
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Tokens;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class Tokens {

        /* renamed from: a, reason: collision with root package name */
        public static final float f4749a;
        public static final float b;
        public static final float d;
        public static final float e;
        public static final float h;
        public static final float c = 24;
        public static final float f = 40;
        public static final float g = 32;
        public static final float i = 4;

        static {
            float f2 = 8;
            f4749a = f2;
            float f3 = 20;
            b = f3;
            d = f3;
            e = f2;
            h = f2;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant;", "", "Primary", "Secondary", "Tertiary", "Destructive", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Destructive;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Primary;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Secondary;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Tertiary;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Variant {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Destructive;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class Destructive implements Variant {

            /* renamed from: a, reason: collision with root package name */
            public static final Destructive f4750a = new Destructive();

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long b(boolean z, Composer composer) {
                long j;
                composer.o(-1408106854);
                if (z) {
                    composer.o(34562499);
                    j = CoreTheme.b(composer).f4782a.f4783a.f4784a.f4785a;
                    composer.l();
                } else {
                    composer.o(34455394);
                    j = CoreTheme.b(composer).f4782a.f4783a.f4784a.b;
                    composer.l();
                }
                long j2 = ((Color) SingleValueAnimationKt.b(j, null, "containerColor", composer, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                composer.l();
                return j2;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long c(boolean z, Composer composer) {
                long j;
                composer.o(-1638457582);
                if (z) {
                    composer.o(1013755537);
                    j = CoreTheme.b(composer).f4782a.d.f4796a.f4797a;
                    composer.l();
                } else {
                    composer.o(1013654384);
                    j = CoreTheme.b(composer).f4782a.d.f4796a.b;
                    composer.l();
                }
                long j2 = ((Color) SingleValueAnimationKt.b(j, null, "contentColor", composer, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                composer.l();
                return j2;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Destructive);
            }

            public final int hashCode() {
                return 750182496;
            }

            public final String toString() {
                return "Destructive";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Primary;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Primary implements Variant {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f4751a;

            public Primary(boolean z) {
                this.f4751a = z;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long b(boolean z, Composer composer) {
                Composer composer2;
                long j;
                long j2;
                composer.o(-552508646);
                if (this.f4751a) {
                    composer.o(-1470266341);
                    if (z) {
                        composer.o(-1470081953);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.b.f4786a;
                        composer.l();
                    } else {
                        composer.o(-1470193026);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.b.b;
                        composer.l();
                    }
                    composer2 = composer;
                    j = ((Color) SingleValueAnimationKt.b(j2, null, "containerColor", composer2, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                    composer2.l();
                } else {
                    composer2 = composer;
                    composer2.o(-1469876051);
                    j = CoreTheme.b(composer2).f4782a.f4783a.b.c;
                    composer2.l();
                }
                composer2.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long c(boolean z, Composer composer) {
                long j;
                composer.o(-1943437422);
                if (this.f4751a) {
                    composer.o(-784972067);
                    j = CoreTheme.b(composer).f4782a.d.c.f4800a;
                    composer.l();
                } else {
                    composer.o(-784883717);
                    j = CoreTheme.b(composer).f4782a.d.c.c;
                    composer.l();
                }
                composer.l();
                return j;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Secondary;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Secondary implements Variant {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f4752a;

            public Secondary(boolean z) {
                this.f4752a = z;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final BorderStroke a(boolean z, Composer composer) {
                long j;
                composer.o(940124511);
                if (this.f4752a) {
                    composer.o(-232253778);
                    if (z) {
                        composer.o(-232108388);
                        j = CoreTheme.b(composer).f4782a.b.f4789a.f4790a;
                        composer.l();
                    } else {
                        composer.o(-232217477);
                        j = CoreTheme.b(composer).f4782a.b.f4789a.b;
                        composer.l();
                    }
                    composer.l();
                } else {
                    composer.o(-231978622);
                    j = CoreTheme.b(composer).f4782a.b.f4789a.c;
                    composer.l();
                }
                BorderStroke borderStrokeA = BorderStrokeKt.a(((Color) SingleValueAnimationKt.b(j, null, "borderColor", composer, KyberEngine.KyberPolyBytes, 10).getD()).f1766a, 1);
                composer.l();
                return borderStrokeA;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long b(boolean z, Composer composer) {
                Composer composer2;
                long j;
                long j2;
                composer.o(-1851167000);
                if (this.f4752a) {
                    composer.o(-735887863);
                    if (z) {
                        composer.o(-735701553);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.c.f4787a;
                        composer.l();
                    } else {
                        composer.o(-735814610);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.c.b;
                        composer.l();
                    }
                    composer2 = composer;
                    j = ((Color) SingleValueAnimationKt.b(j2, null, "containerColor", composer2, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                    composer2.l();
                } else {
                    composer2 = composer;
                    composer2.o(-735493667);
                    j = CoreTheme.b(composer2).f4782a.f4783a.c.c;
                    composer2.l();
                }
                composer2.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long c(boolean z, Composer composer) {
                Composer composer2;
                long j;
                long j2;
                composer.o(1496075616);
                if (this.f4752a) {
                    composer.o(713171743);
                    if (z) {
                        composer.o(713352349);
                        j2 = CoreTheme.b(composer).f4782a.d.d.f4801a;
                        composer.l();
                    } else {
                        composer.o(713245244);
                        j2 = CoreTheme.b(composer).f4782a.d.d.b;
                        composer.l();
                    }
                    composer2 = composer;
                    j = ((Color) SingleValueAnimationKt.b(j2, null, "contentColor", composer2, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                    composer2.l();
                } else {
                    composer2 = composer;
                    composer2.o(713552299);
                    j = CoreTheme.b(composer2).f4782a.d.d.c;
                    composer2.l();
                }
                composer2.l();
                return j;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant$Tertiary;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonSpec$Variant;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Tertiary implements Variant {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f4753a;

            public Tertiary(boolean z) {
                this.f4753a = z;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long b(boolean z, Composer composer) {
                Composer composer2;
                long j;
                long j2;
                composer.o(1834309654);
                if (this.f4753a) {
                    composer.o(1050123741);
                    if (z) {
                        composer.o(1050309090);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.d.f4788a;
                        composer.l();
                    } else {
                        composer.o(1050197025);
                        j2 = CoreTheme.b(composer).f4782a.f4783a.d.b;
                        composer.l();
                    }
                    composer2 = composer;
                    j = ((Color) SingleValueAnimationKt.b(j2, null, "containerColor", composer2, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                    composer2.l();
                } else {
                    composer2 = composer;
                    composer2.o(1050515984);
                    j = CoreTheme.b(composer2).f4782a.f4783a.d.c;
                    composer2.l();
                }
                composer2.l();
                return j;
            }

            @Override // au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec.Variant
            public final long c(boolean z, Composer composer) {
                Composer composer2;
                long j;
                long j2;
                composer.o(1665190558);
                if (this.f4753a) {
                    composer.o(819770595);
                    if (z) {
                        composer.o(819950240);
                        j2 = CoreTheme.b(composer).f4782a.d.e.f4802a;
                        composer.l();
                    } else {
                        composer.o(819844127);
                        j2 = CoreTheme.b(composer).f4782a.d.e.b;
                        composer.l();
                    }
                    composer2 = composer;
                    j = ((Color) SingleValueAnimationKt.b(j2, null, "contentColor", composer2, KyberEngine.KyberPolyBytes, 10).getD()).f1766a;
                    composer2.l();
                } else {
                    composer2 = composer;
                    composer2.o(820149198);
                    j = CoreTheme.b(composer2).f4782a.d.e.c;
                    composer2.l();
                }
                composer2.l();
                return j;
            }
        }

        default BorderStroke a(boolean z, Composer composer) {
            composer.o(-1850143601);
            composer.l();
            return null;
        }

        long b(boolean z, Composer composer);

        long c(boolean z, Composer composer);
    }
}
