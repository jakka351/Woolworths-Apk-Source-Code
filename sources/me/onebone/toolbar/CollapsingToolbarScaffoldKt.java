package me.onebone.toolbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lib_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Type inference failed for: r9v15, types: [kotlin.jvm.internal.Lambda, me.onebone.toolbar.CollapsingToolbarScaffoldKt$CollapsingToolbarScaffold$1$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.Modifier r16, final me.onebone.toolbar.CollapsingToolbarScaffoldState r17, boolean r18, androidx.compose.ui.Modifier r19, final androidx.compose.runtime.internal.ComposableLambdaImpl r20, final androidx.compose.runtime.internal.ComposableLambdaImpl r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.onebone.toolbar.CollapsingToolbarScaffoldKt.a(androidx.compose.ui.Modifier, me.onebone.toolbar.CollapsingToolbarScaffoldState, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final CollapsingToolbarScaffoldState b(final CollapsingToolbarState collapsingToolbarState, Composer composer, int i) {
        composer.F(1940877299);
        if ((i & 1) != 0) {
            collapsingToolbarState = CollapsingToolbarKt.b(0, 1, composer);
        }
        Object[] objArr = {collapsingToolbarState};
        CollapsingToolbarScaffoldStateSaver collapsingToolbarScaffoldStateSaver = new CollapsingToolbarScaffoldStateSaver();
        composer.F(1157296644);
        boolean zN = composer.n(collapsingToolbarState);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function0<CollapsingToolbarScaffoldState>() { // from class: me.onebone.toolbar.CollapsingToolbarScaffoldKt$rememberCollapsingToolbarScaffoldState$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new CollapsingToolbarScaffoldState(collapsingToolbarState, 0);
                }
            };
            composer.A(objG);
        }
        composer.N();
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) RememberSaveableKt.c(objArr, collapsingToolbarScaffoldStateSaver, (Function0) objG, composer, 8, 4);
        composer.N();
        return collapsingToolbarScaffoldState;
    }
}
