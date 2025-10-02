package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ReportDrawnKt {
    public static final void a(Composer composer, final int i) {
        final FullyDrawnReporter fullyDrawnReporter;
        ComposerImpl composerImplV = composer.v(-2047119994);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composerImplV.x(LocalFullyDrawnReporterOwner.f67a);
            Object obj = null;
            if (fullyDrawnReporterOwner == null) {
                composerImplV.o(-1738308180);
                View view = (View) composerImplV.x(AndroidCompositionLocals_androidKt.f);
                Intrinsics.h(view, "<this>");
                while (true) {
                    if (view == null) {
                        fullyDrawnReporterOwner = null;
                        break;
                    }
                    Object tag = view.getTag(com.woolworths.R.id.report_drawn);
                    FullyDrawnReporterOwner fullyDrawnReporterOwner2 = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
                    if (fullyDrawnReporterOwner2 != null) {
                        fullyDrawnReporterOwner = fullyDrawnReporterOwner2;
                        break;
                    } else {
                        Object objA = ViewTree.a(view);
                        view = objA instanceof View ? (View) objA : null;
                    }
                }
                composerImplV.l();
            } else {
                composerImplV.o(-1738310474);
                composerImplV.l();
            }
            if (fullyDrawnReporterOwner == null) {
                composerImplV.o(-1738306337);
                Object baseContext = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    if (baseContext instanceof FullyDrawnReporterOwner) {
                        obj = baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                fullyDrawnReporterOwner = (FullyDrawnReporterOwner) obj;
                composerImplV.l();
            } else {
                composerImplV.o(-1738310398);
                composerImplV.l();
            }
            if (fullyDrawnReporterOwner == null || (fullyDrawnReporter = fullyDrawnReporterOwner.getFullyDrawnReporter()) == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                        public final /* synthetic */ Function0 h = ReportDrawnKt$ReportDrawn$1.h;

                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Number) obj3).intValue();
                            ReportDrawnKt.a((Composer) obj2, RecomposeScopeImplKt.a(7));
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zI = composerImplV.I(fullyDrawnReporter);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1
                    public final /* synthetic */ Function0 i = ReportDrawnKt$ReportDrawn$1.h;

                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        FullyDrawnReporter fullyDrawnReporter2 = fullyDrawnReporter;
                        if (fullyDrawnReporter2.b()) {
                            return new ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1();
                        }
                        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter2);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                ReportDrawnComposition reportDrawnComposition2 = reportDrawnComposition;
                                SnapshotStateObserver snapshotStateObserver = reportDrawnComposition2.f;
                                snapshotStateObserver.c(ReportDrawnKt$ReportDrawn$1.h);
                                FullyDrawnReporter fullyDrawnReporter3 = reportDrawnComposition2.d;
                                if (!fullyDrawnReporter3.b()) {
                                    fullyDrawnReporter3.c();
                                }
                                snapshotStateObserver.b();
                                androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
                                if (aVar != null) {
                                    aVar.dispose();
                                }
                            }
                        };
                    }
                };
                composerImplV.A(objG);
            }
            EffectsKt.b(fullyDrawnReporter, ReportDrawnKt$ReportDrawn$1.h, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$2
                public final /* synthetic */ Function0 h = ReportDrawnKt$ReportDrawn$1.h;

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    ReportDrawnKt.a((Composer) obj2, RecomposeScopeImplKt.a(7));
                    return Unit.f24250a;
                }
            };
        }
    }
}
