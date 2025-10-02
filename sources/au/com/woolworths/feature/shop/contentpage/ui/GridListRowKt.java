package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.shop.aem.components.model.gridlist.GridListItem;
import au.com.woolworths.shop.aem.components.model.gridlist.GridRowData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfigKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GridListRowKt {
    public static final void a(final GridRowData gridRowData, final Function2 function2, final Modifier modifier, Composer composer, final int i) {
        SnapshotStateMap snapshotStateMap;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        RecipeCardSummaryConfig recipeCardSummaryConfig;
        float f;
        boolean z;
        List list = gridRowData.c;
        ComposerImpl composerImplV = composer.v(-420504298);
        int i2 = i | (composerImplV.I(gridRowData) ? 4 : 2) | (composerImplV.I(function2) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) != 146 || !composerImplV.c()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!(((GridListItem) it.next()) instanceof RecipeCardSummaryData)) {
                        break;
                    }
                }
            }
            if (!list.isEmpty()) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$12) {
                    objG = new SnapshotStateMap();
                    composerImplV.A(objG);
                }
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objG;
                composerImplV.V(false);
                float f2 = 1.0f;
                Modifier modifierG = PaddingKt.g(SizeKt.e(modifier, 1.0f), 16, 6);
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(12), Alignment.Companion.j, composerImplV, 6);
                int i3 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                List list3 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (obj instanceof RecipeCardSummaryData) {
                        arrayList.add(obj);
                    }
                }
                RecipeCardSummaryConfig recipeCardSummaryConfigA = RecipeCardSummaryConfigKt.a(arrayList);
                composerImplV.o(83867522);
                Iterator it2 = list3.iterator();
                int i4 = 0;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    Modifier.Companion companion = Modifier.Companion.d;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                    if (zHasNext) {
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        GridListItem gridListItem = (GridListItem) next;
                        composerImplV.o(83868876);
                        if (gridListItem instanceof RecipeCardSummaryData) {
                            Integer numValueOf = Integer.valueOf(i4 / 2);
                            Object sharedIntrinsicHeightState = snapshotStateMap2.get(numValueOf);
                            if (sharedIntrinsicHeightState == null) {
                                sharedIntrinsicHeightState = new SharedIntrinsicHeightState();
                                snapshotStateMap2.put(numValueOf, sharedIntrinsicHeightState);
                            }
                            SharedIntrinsicHeightState sharedIntrinsicHeightState2 = (SharedIntrinsicHeightState) sharedIntrinsicHeightState;
                            Modifier modifierA = rowScopeInstance.a(SizeKt.e(companion, f2), 0.5f, true);
                            SnapshotStateMap snapshotStateMap3 = snapshotStateMap2;
                            RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) gridListItem;
                            composerImplV.o(-1746271574);
                            snapshotStateMap = snapshotStateMap3;
                            boolean zI = composerImplV.I(gridListItem) | ((i2 & 112) == 32) | ((i2 & 14) == 4 || composerImplV.I(gridRowData));
                            Object objG2 = composerImplV.G();
                            if (zI || objG2 == composer$Companion$Empty$12) {
                                objG2 = new androidx.work.impl.utils.c(8, function2, gridRowData, recipeCardSummaryData);
                                composerImplV.A(objG2);
                            }
                            composerImplV.V(false);
                            composer$Companion$Empty$1 = composer$Companion$Empty$12;
                            recipeCardSummaryConfig = recipeCardSummaryConfigA;
                            z = false;
                            f = 1.0f;
                            RecipeCardKt.a(recipeCardSummaryData, recipeCardSummaryConfig, (Function0) objG2, modifierA, false, sharedIntrinsicHeightState2, composerImplV, 24584, 0);
                        } else {
                            snapshotStateMap = snapshotStateMap2;
                            composer$Companion$Empty$1 = composer$Companion$Empty$12;
                            recipeCardSummaryConfig = recipeCardSummaryConfigA;
                            f = f2;
                            z = false;
                        }
                        composerImplV.V(z);
                        recipeCardSummaryConfigA = recipeCardSummaryConfig;
                        composer$Companion$Empty$12 = composer$Companion$Empty$1;
                        f2 = f;
                        i4 = i5;
                        snapshotStateMap2 = snapshotStateMap;
                    } else {
                        composerImplV.V(false);
                        composerImplV.o(83903999);
                        if (list.size() == 1) {
                            SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 0.5f, true));
                        }
                        composerImplV.V(false);
                        composerImplV.V(true);
                    }
                }
            }
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                final int i6 = 0;
                recomposeScopeImplX.d = new Function2(gridRowData, function2, modifier, i, i6) { // from class: au.com.woolworths.feature.shop.contentpage.ui.h
                    public final /* synthetic */ int d;
                    public final /* synthetic */ GridRowData e;
                    public final /* synthetic */ Function2 f;
                    public final /* synthetic */ Modifier g;

                    {
                        this.d = i6;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = this.d;
                        Composer composer2 = (Composer) obj2;
                        ((Integer) obj3).getClass();
                        switch (i7) {
                            case 0:
                                GridListRowKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                                break;
                            default:
                                GridListRowKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                return;
            }
            return;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i7 = 1;
            recomposeScopeImplX2.d = new Function2(gridRowData, function2, modifier, i, i7) { // from class: au.com.woolworths.feature.shop.contentpage.ui.h
                public final /* synthetic */ int d;
                public final /* synthetic */ GridRowData e;
                public final /* synthetic */ Function2 f;
                public final /* synthetic */ Modifier g;

                {
                    this.d = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i72 = this.d;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i72) {
                        case 0:
                            GridListRowKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                            break;
                        default:
                            GridListRowKt.a(this.e, this.f, this.g, composer2, RecomposeScopeImplKt.a(9));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
