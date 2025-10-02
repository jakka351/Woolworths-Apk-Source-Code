package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsPageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Density e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ d(Density density, MutableState mutableState, int i) {
        this.d = i;
        this.e = density;
        this.f = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        MutableState mutableState = this.f;
        Density density = this.e;
        switch (i) {
            case 0:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                int i2 = SubscribePlanItemUiKt.b;
                Intrinsics.h(coordinates, "coordinates");
                mutableState.setValue(new Dp(density.C(((int) (coordinates.a() & 4294967295L)) / 2.0f)));
                break;
            case 1:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.h(it, "it");
                mutableState.setValue(new Dp(density.B((int) (it.a() & 4294967295L))));
                break;
            case 2:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                float f = RecipeDetailsPageKt.f8026a;
                Intrinsics.h(it2, "it");
                mutableState.setValue(new Dp(density.B((int) (it2.a() & 4294967295L))));
                break;
            default:
                mutableState.setValue(new Dp(density.B((int) (((IntSize) obj).f2202a & 4294967295L))));
                break;
        }
        return unit;
    }
}
