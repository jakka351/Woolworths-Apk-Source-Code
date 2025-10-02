package au.com.woolworths.markdown.compat;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.widget.TextViewCompat;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.Markwon;
import io.noties.markwon.SoftBreakAddsNewLinePlugin;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.glide.GlideImagesPlugin;
import io.noties.markwon.linkify.LinkifyPlugin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"markdown_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MarkdownCompatKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r26, androidx.compose.ui.Modifier r27, au.com.woolworths.markdown.compat.MarkdownTextViewStyle r28, kotlin.jvm.functions.Function1 r29, boolean r30, androidx.compose.ui.graphics.Color r31, kotlin.jvm.functions.Function2 r32, boolean r33, java.lang.Iterable r34, kotlin.jvm.functions.Function2 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.markdown.compat.MarkdownCompatKt.a(java.lang.String, androidx.compose.ui.Modifier, au.com.woolworths.markdown.compat.MarkdownTextViewStyle, kotlin.jvm.functions.Function1, boolean, androidx.compose.ui.graphics.Color, kotlin.jvm.functions.Function2, boolean, java.lang.Iterable, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r18, int r19, androidx.compose.ui.Modifier r20, androidx.compose.ui.graphics.Color r21, kotlin.jvm.functions.Function2 r22, java.lang.Iterable r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.markdown.compat.MarkdownCompatKt.b(java.lang.String, int, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, kotlin.jvm.functions.Function2, java.lang.Iterable, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TextView c(Context context, MarkdownTextViewStyle markdownTextViewStyle) {
        Intrinsics.h(context, "context");
        if (markdownTextViewStyle == null) {
            throw new IllegalArgumentException("Please provide MarkdownTextViewStyle for MarkdownCompat to create default TextView OR create a TextView on your own.");
        }
        TextStyle textStyle = markdownTextViewStyle.c;
        TextView textView = new TextView(context);
        textView.setTextColor(ColorKt.j(markdownTextViewStyle.b));
        long j = textStyle.b.c;
        if (!((1095216660480L & j) == 0)) {
            TextViewCompat.a(textView, (int) markdownTextViewStyle.f9046a.t1(j));
        }
        textView.setTextSize(TextUnit.c(textStyle.f2068a.fontSize));
        TextAlign textAlign = markdownTextViewStyle.d;
        if (textAlign != null && textAlign.f2156a == 1) {
            textView.setGravity(3);
        } else if (textAlign != null && textAlign.f2156a == 2) {
            textView.setGravity(5);
        } else if (textAlign != null && textAlign.f2156a == 3) {
            textView.setGravity(17);
        } else if (textAlign != null && textAlign.f2156a == 4) {
            textView.setJustificationMode(1);
        } else if (textAlign != null && textAlign.f2156a == 5) {
            textView.setGravity(8388611);
        } else if (textAlign != null && textAlign.f2156a == 6) {
            textView.setGravity(8388613);
        }
        textView.setImportantForAccessibility(markdownTextViewStyle.e ? 0 : 2);
        return textView;
    }

    public static final void d(TextView textView, String str, boolean z, Integer num, Function2 function2, boolean z2, Iterable iterable) {
        if (str != null) {
            Markwon.Builder builderA = Markwon.a(textView.getContext());
            if (z) {
                builderA.b(new LinkifyPlugin());
            }
            if (z2) {
                builderA.b(GlideImagesPlugin.k(textView.getContext()));
            }
            if (num != null) {
                final int iIntValue = num.intValue();
                builderA.b(new AbstractMarkwonPlugin() { // from class: au.com.woolworths.markdown.compat.MarkdownCompatKt$configureMarkdown$1$1$1$1
                    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
                    public final void j(MarkwonTheme.Builder builder) {
                        builder.f24203a = iIntValue;
                    }
                });
            }
            if (iterable != null) {
                builderA.a(iterable);
            }
            builderA.b(new MarkdownLinkPlugin(function2));
            builderA.b(new SoftBreakAddsNewLinePlugin());
            builderA.build().c(textView, str);
        }
    }
}
