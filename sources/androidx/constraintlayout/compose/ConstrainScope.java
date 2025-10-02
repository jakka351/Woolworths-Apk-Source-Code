package androidx.constraintlayout.compose;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@LayoutScopeMarker
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "DimensionProperty", "DpProperty", "FloatProperty", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ConstrainScope {
    public static final /* synthetic */ KProperty[] k;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2234a;
    public final CLObject b;
    public final ConstrainedLayoutReference c = new ConstrainedLayoutReference("parent");
    public final VerticalAnchorable d;
    public final HorizontalAnchorable e;
    public final VerticalAnchorable f;
    public final HorizontalAnchorable g;
    public final BaselineAnchorable h;
    public final DimensionProperty i;
    public final DimensionProperty j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/compose/Dimension;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DimensionProperty extends ObservableProperty<Dimension> {
        public DimensionProperty(DimensionDescription dimensionDescription) {
            super(dimensionDescription);
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
            CLElement cLElementA;
            Dimension dimension = (Dimension) obj2;
            CLObject cLObject = ConstrainScope.this.b;
            String name = kProperty.getName();
            Intrinsics.f(dimension, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            DimensionDescription dimensionDescription = (DimensionDescription) dimension;
            DimensionSymbol dimensionSymbol = dimensionDescription.f2241a;
            DimensionSymbol dimensionSymbol2 = dimensionDescription.c;
            String str = dimensionSymbol2.f2242a;
            DimensionSymbol dimensionSymbol3 = dimensionDescription.b;
            String str2 = dimensionSymbol3.f2242a;
            if (str2 == null && str == null) {
                cLElementA = dimensionSymbol.a();
            } else {
                CLObject cLObject2 = new CLObject(new char[0]);
                if (str2 != null) {
                    cLObject2.I("min", dimensionSymbol3.a());
                }
                if (str != null) {
                    cLObject2.I("max", dimensionSymbol2.a());
                }
                cLObject2.I("value", dimensionSymbol.a());
                cLElementA = cLObject2;
            }
            cLObject.I(name, cLElementA);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/compose/ui/unit/Dp;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DpProperty extends ObservableProperty<Dp> {
        public DpProperty(float f) {
            super(new Dp(f));
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
            float f = ((Dp) obj).d;
            float f2 = ((Dp) obj2).d;
            if (Float.isNaN(f2)) {
                return;
            }
            ConstrainScope.this.b.I(kProperty.getName(), new CLNumber(f2));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "Lkotlin/properties/ObservableProperty;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FloatProperty extends ObservableProperty<Float> {
        public final String b;

        public FloatProperty(float f, String str) {
            super(Float.valueOf(f));
            this.b = str;
        }

        @Override // kotlin.properties.ObservableProperty
        public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
            ((Number) obj).floatValue();
            float fFloatValue = ((Number) obj2).floatValue();
            if (Float.isNaN(fFloatValue)) {
                return;
            }
            CLObject cLObject = ConstrainScope.this.b;
            String name = this.b;
            if (name == null) {
                name = kProperty.getName();
            }
            cLObject.I(name, new CLNumber(fFloatValue));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        k = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0, reflectionFactory), b.y(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0, reflectionFactory), b.y(ConstrainScope.class, "scaleX", "getScaleX()F", 0, reflectionFactory), b.y(ConstrainScope.class, "scaleY", "getScaleY()F", 0, reflectionFactory), b.y(ConstrainScope.class, "rotationX", "getRotationX()F", 0, reflectionFactory), b.y(ConstrainScope.class, "rotationY", "getRotationY()F", 0, reflectionFactory), b.y(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0, reflectionFactory), b.y(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0, reflectionFactory), b.y(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0, reflectionFactory), b.y(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0, reflectionFactory), b.y(ConstrainScope.class, "pivotX", "getPivotX()F", 0, reflectionFactory), b.y(ConstrainScope.class, "pivotY", "getPivotY()F", 0, reflectionFactory), b.y(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0, reflectionFactory), b.y(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0, reflectionFactory)};
    }

    public ConstrainScope(Object obj, CLObject cLObject) {
        this.f2234a = obj;
        this.b = cLObject;
        this.d = new ConstraintVerticalAnchorable(cLObject, -2);
        new ConstraintVerticalAnchorable(cLObject, 0);
        this.e = new ConstraintHorizontalAnchorable(cLObject, 0);
        this.f = new ConstraintVerticalAnchorable(cLObject, -1);
        new ConstraintVerticalAnchorable(cLObject, 1);
        this.g = new ConstraintHorizontalAnchorable(cLObject, 1);
        this.h = new ConstraintBaselineAnchorable(cLObject);
        this.i = new DimensionProperty(new DimensionDescription("wrap"));
        this.j = new DimensionProperty(new DimensionDescription("wrap"));
        new FloatProperty(1.0f, null);
        new FloatProperty(1.0f, null);
        new FloatProperty(BitmapDescriptorFactory.HUE_RED, null);
        new FloatProperty(BitmapDescriptorFactory.HUE_RED, null);
        new FloatProperty(BitmapDescriptorFactory.HUE_RED, null);
        float f = 0;
        new DpProperty(f);
        new DpProperty(f);
        new DpProperty(f);
        new FloatProperty(0.5f, null);
        new FloatProperty(0.5f, null);
        new FloatProperty(Float.NaN, "hWeight");
        new FloatProperty(Float.NaN, "vWeight");
    }
}
