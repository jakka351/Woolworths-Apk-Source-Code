package com.halilibo.richtext.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/BlockQuoteGutter;", "", "BarGutter", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BlockQuoteGutter {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/BlockQuoteGutter$BarGutter;", "Lcom/halilibo/richtext/ui/BlockQuoteGutter;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class BarGutter implements BlockQuoteGutter {

        /* renamed from: a, reason: collision with root package name */
        public final long f16275a;
        public final long b;
        public final long c;
        public final Function1 d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.halilibo.richtext.ui.BlockQuoteGutter$BarGutter$1, reason: invalid class name */
        final class AnonymousClass1 implements Function1<Color, Color> {
            public static final AnonymousClass1 d = new AnonymousClass1();

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return new Color(Color.b(((Color) obj).f1766a, 0.25f));
            }
        }

        public BarGutter() {
            long jC = TextUnitKt.c(6);
            long jC2 = TextUnitKt.c(3);
            long jC3 = TextUnitKt.c(6);
            this.f16275a = jC;
            this.b = jC2;
            this.c = jC3;
            this.d = AnonymousClass1.d;
        }

        @Override // com.halilibo.richtext.ui.BlockQuoteGutter
        public final void a(RichTextScope richTextScope, Composer composer, int i) {
            Intrinsics.h(richTextScope, "<this>");
            composer.o(2046098125);
            Density density = (Density) composer.x(CompositionLocalsKt.h);
            long j = ((Color) this.d.invoke(new Color(RichTextLocalsKt.c(richTextScope, composer)))).f1766a;
            composer.o(-348211689);
            long j2 = this.f16275a;
            boolean zS = composer.s(j2);
            long j3 = this.c;
            boolean zS2 = zS | composer.s(j3);
            long j4 = this.b;
            boolean zS3 = zS2 | composer.s(j4) | composer.s(j);
            Object objG = composer.G();
            if (zS3 || objG == Composer.Companion.f1624a) {
                objG = BackgroundKt.b(SizeKt.u(PaddingKt.j(Modifier.Companion.d, density.r(j2), BitmapDescriptorFactory.HUE_RED, density.r(j3), BitmapDescriptorFactory.HUE_RED, 10), density.r(j4)), j, RoundedCornerShapeKt.a(50));
                composer.A(objG);
            }
            composer.l();
            BoxKt.a((Modifier) objG, composer, 0);
            composer.l();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarGutter)) {
                return false;
            }
            BarGutter barGutter = (BarGutter) obj;
            return TextUnit.a(this.f16275a, barGutter.f16275a) && TextUnit.a(this.b, barGutter.b) && TextUnit.a(this.c, barGutter.c) && Intrinsics.c(this.d, barGutter.d);
        }

        public final int hashCode() {
            TextUnitType[] textUnitTypeArr = TextUnit.b;
            return this.d.hashCode() + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f16275a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            String strE = TextUnit.e(this.f16275a);
            String strE2 = TextUnit.e(this.b);
            String strE3 = TextUnit.e(this.c);
            StringBuilder sbV = YU.a.v("BarGutter(startMargin=", strE, ", barWidth=", strE2, ", endMargin=");
            sbV.append(strE3);
            sbV.append(", color=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    void a(RichTextScope richTextScope, Composer composer, int i);
}
