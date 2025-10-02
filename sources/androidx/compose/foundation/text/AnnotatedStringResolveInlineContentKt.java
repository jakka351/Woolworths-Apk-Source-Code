package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.StringAnnotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*:\b\u0000\u0010\u0005\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00040\u00002\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00040\u0000*\u0018\b\u0000\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00060\u00002\b\u0012\u0004\u0012\u00020\u00060\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "InlineContentRange", "Landroidx/compose/ui/text/Placeholder;", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnnotatedStringResolveInlineContentKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Pair f1102a;

    static {
        EmptyList emptyList = EmptyList.d;
        f1102a = new Pair(emptyList, emptyList);
    }

    public static final void a(final AnnotatedString annotatedString, final List list, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1794596951);
        int i2 = (i & 6) == 0 ? (composerImplV.n(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(list) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                Function3 function3 = (Function3) range.f2032a;
                int i4 = range.b;
                int i5 = range.c;
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.f1103a, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    b.B(i6, composerImplV, i6, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                function3.invoke(annotatedString.subSequence(i4, i5).e, composerImplV, 0);
                composerImplV.V(true);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    AnnotatedStringResolveInlineContentKt.a(annotatedString, list, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final boolean b(AnnotatedString annotatedString) {
        int length = annotatedString.e.length();
        List list = annotatedString.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i);
                if ((range.f2032a instanceof StringAnnotation) && Intrinsics.c("androidx.compose.foundation.text.inlineContent", range.d) && AnnotatedStringKt.b(0, length, range.b, range.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Pair c(AnnotatedString annotatedString, Map map) {
        if (map == null || map.isEmpty()) {
            return f1102a;
        }
        List listC = annotatedString.c(annotatedString.e.length(), "androidx.compose.foundation.text.inlineContent");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listC.get(i);
            Object obj = range.f2032a;
            int i2 = range.c;
            int i3 = range.b;
            InlineTextContent inlineTextContent = (InlineTextContent) map.get(obj);
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(i3, i2, inlineTextContent.f1113a));
                arrayList2.add(new AnnotatedString.Range(i3, i2, inlineTextContent.b));
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
