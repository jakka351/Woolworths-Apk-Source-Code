package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/RichTextThemeConfiguration;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RichTextThemeConfiguration {
    public static final RichTextThemeConfiguration e = new RichTextThemeConfiguration();

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f16292a;
    public final Function4 b;
    public final Function2 c;
    public final Function4 d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.halilibo.richtext.ui.RichTextThemeConfiguration$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, TextStyle> {
        public static final AnonymousClass1 d = new AnonymousClass1();

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            ((Number) obj2).intValue();
            composer.o(-333154667);
            TextStyle textStyle = (TextStyle) composer.x(RichTextLocalsKt.f16288a);
            composer.l();
            return textStyle;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.halilibo.richtext.ui.RichTextThemeConfiguration$2, reason: invalid class name */
    final class AnonymousClass2 implements Function2<Composer, Integer, Color> {
        public static final AnonymousClass2 d = new AnonymousClass2();

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            ((Number) obj2).intValue();
            composer.o(1457540156);
            long j = ((Color) composer.x(RichTextLocalsKt.b)).f1766a;
            composer.l();
            return new Color(j);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/RichTextThemeConfiguration$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ RichTextThemeConfiguration() {
        this(AnonymousClass1.d, ComposableSingletons$RichTextThemeConfigurationKt.f16280a, AnonymousClass2.d, ComposableSingletons$RichTextThemeConfigurationKt.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextThemeConfiguration)) {
            return false;
        }
        RichTextThemeConfiguration richTextThemeConfiguration = (RichTextThemeConfiguration) obj;
        return Intrinsics.c(this.f16292a, richTextThemeConfiguration.f16292a) && Intrinsics.c(this.b, richTextThemeConfiguration.b) && Intrinsics.c(this.c, richTextThemeConfiguration.c) && Intrinsics.c(this.d, richTextThemeConfiguration.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f16292a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.f16292a + ", textStyleBackProvider=" + this.b + ", contentColorProvider=" + this.c + ", contentColorBackProvider=" + this.d + ")";
    }

    public RichTextThemeConfiguration(Function2 textStyleProvider, Function4 textStyleBackProvider, Function2 contentColorProvider, Function4 contentColorBackProvider) {
        Intrinsics.h(textStyleProvider, "textStyleProvider");
        Intrinsics.h(textStyleBackProvider, "textStyleBackProvider");
        Intrinsics.h(contentColorProvider, "contentColorProvider");
        Intrinsics.h(contentColorBackProvider, "contentColorBackProvider");
        this.f16292a = textStyleProvider;
        this.b = textStyleBackProvider;
        this.c = contentColorProvider;
        this.d = contentColorBackProvider;
    }
}
