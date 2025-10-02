package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenuScope {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f857a = new SnapshotStateList();

    public static void b(ContextMenuScope contextMenuScope, final ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1, final Function0 function0) {
        contextMenuScope.f857a.add(new ComposableLambdaImpl(new Function3<ContextMenuColors, Composer, Integer, Unit>(function0) { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$item$1
            public final /* synthetic */ Lambda i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
                this.i = (Lambda) function0;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.n(contextMenuColors) ? 4 : 2;
                }
                if (composer.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) this.h.invoke(composer, 0);
                    if (StringsKt.D(str)) {
                        InlineClassHelperKt.c("Label must not be blank");
                    }
                    ContextMenuUi_androidKt.b(str, contextMenuColors, this.i, composer, (iIntValue << 6) & 896);
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, 262103052));
    }

    public final void a(final ContextMenuColors contextMenuColors, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1320309496);
        int i2 = (composerImplV.n(contextMenuColors) ? 4 : 2) | i | (composerImplV.n(this) ? 32 : 16);
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f857a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((Function3) snapshotStateList.get(i3)).invoke(contextMenuColors, composerImplV, Integer.valueOf(i2 & 14));
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(contextMenuColors, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                public final /* synthetic */ ContextMenuColors i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    this.h.a(this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
