package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.woolworths.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/compose/runtime/CompositionServices;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {
    public final AndroidComposeView d;
    public final CompositionImpl e;
    public boolean f;
    public Lifecycle g;
    public Function2 h = ComposableSingletons$Wrapper_androidKt.f1963a;

    public WrappedComposition(AndroidComposeView androidComposeView, CompositionImpl compositionImpl) {
        this.d = androidComposeView;
        this.e = compositionImpl;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f) {
                return;
            }
            d(this.h);
        }
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: b */
    public final boolean getW() {
        return this.e.w;
    }

    @Override // androidx.compose.runtime.Composition
    public final void d(final Function2 function2) {
        this.d.setOnViewTreeOwnersAvailable(new Function1<AndroidComposeView.ViewTreeOwners, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AndroidComposeView.ViewTreeOwners viewTreeOwners = (AndroidComposeView.ViewTreeOwners) obj;
                final WrappedComposition wrappedComposition = this.h;
                if (!wrappedComposition.f) {
                    Lifecycle d = viewTreeOwners.f1938a.getD();
                    final Function2 function22 = function2;
                    wrappedComposition.h = function22;
                    if (wrappedComposition.g == null) {
                        wrappedComposition.g = d;
                        d.a(wrappedComposition);
                    } else if (d.getD().compareTo(Lifecycle.State.f) >= 0) {
                        wrappedComposition.e.d(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final WrappedComposition wrappedComposition2 = wrappedComposition;
                                    AndroidComposeView androidComposeView = wrappedComposition2.d;
                                    Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
                                    Set set = (!(tag instanceof Set) || ((tag instanceof KMappedMarker) && !(tag instanceof KMutableSet))) ? null : (Set) tag;
                                    if (set == null) {
                                        Object parent = androidComposeView.getParent();
                                        View view = parent instanceof View ? (View) parent : null;
                                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                                        set = (!(tag2 instanceof Set) || ((tag2 instanceof KMappedMarker) && !(tag2 instanceof KMutableSet))) ? null : (Set) tag2;
                                    }
                                    if (set != null) {
                                        set.add(composer.H());
                                        composer.C();
                                    }
                                    boolean zI = composer.I(wrappedComposition2);
                                    Object objG = composer.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (zI || objG == composer$Companion$Empty$1) {
                                        objG = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                        composer.A(objG);
                                    }
                                    EffectsKt.e(composer, androidComposeView, (Function2) objG);
                                    boolean zI2 = composer.I(wrappedComposition2);
                                    Object objG2 = composer.G();
                                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                                        objG2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition2, null);
                                        composer.A(objG2);
                                    }
                                    EffectsKt.e(composer, androidComposeView, (Function2) objG2);
                                    ProvidedValue providedValueB = InspectionTablesKt.f1716a.b(set);
                                    final Function2 function23 = function22;
                                    CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(-1193460702, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            Composer composer2 = (Composer) obj4;
                                            int iIntValue2 = ((Number) obj5).intValue();
                                            if (composer2.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                AndroidCompositionLocals_androidKt.a(wrappedComposition2.d, function23, composer2, 0);
                                            } else {
                                                composer2.j();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer), composer, 56);
                                } else {
                                    composer.j();
                                }
                                return Unit.f24250a;
                            }
                        }, true, -2000640158));
                    }
                }
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        if (!this.f) {
            this.f = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.g;
            if (lifecycle != null) {
                lifecycle.c(this);
            }
        }
        this.e.dispose();
    }
}
