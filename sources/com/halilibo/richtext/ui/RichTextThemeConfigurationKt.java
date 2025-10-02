package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\"\b\u0000\u0010\u0003\"\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002*P\b\u0000\u0010\u0006\"$\u0012\u0004\u0012\u00020\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00022$\u0012\u0004\u0012\u00020\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0002*\"\b\u0000\u0010\b\"\r\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0002\b\u00022\r\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0002\b\u0002*P\b\u0000\u0010\t\"$\u0012\u0004\u0012\u00020\u0007\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00022$\u0012\u0004\u0012\u00020\u0007\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0002¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/runtime/Composable;", "TextStyleProvider", "Lkotlin/Function2;", "", "TextStyleBackProvider", "Landroidx/compose/ui/graphics/Color;", "ContentColorProvider", "ContentColorBackProvider", "richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RichTextThemeConfigurationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16293a = new DynamicProvidableCompositionLocal(new c(3));

    public static final Function4 a(RichTextScope richTextScope, Composer composer) {
        Intrinsics.h(richTextScope, "<this>");
        composer.o(-825890119);
        Function4 function4 = ((RichTextThemeConfiguration) composer.x(f16293a)).b;
        composer.l();
        return function4;
    }
}
