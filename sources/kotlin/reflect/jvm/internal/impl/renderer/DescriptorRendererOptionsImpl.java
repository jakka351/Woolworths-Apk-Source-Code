package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.camera.core.impl.b;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public static final /* synthetic */ KProperty[] Y;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 A;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 B;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 C;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 D;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 E;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 F;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 G;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 H;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 I;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 J;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 K;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 L;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 M;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 N;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 O;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 P;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 Q;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 R;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 S;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 T;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 U;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 V;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 W;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 X;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24524a;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f24520a, this);
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 c;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 d;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 e;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 g;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 h;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 i;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 j;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 k;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 l;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 m;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 n;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 o;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 p;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 q;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 r;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 s;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 t;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 u;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 v;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 w;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 x;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 y;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Y = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, reflectionFactory), b.y(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0, reflectionFactory)};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.e, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$$Lambda$0.d, this);
        this.z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$$Lambda$1.d, this);
        this.A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.e, this);
        this.C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.f24522a, this);
        this.D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.d, this);
        this.E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.d, this);
        this.F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.d, this);
        this.I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(EmptySet.d, this);
        this.L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.f24525a, this);
        this.M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.f, this);
        this.O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.Q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.R = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.S = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.T = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.U = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.V = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.W = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.X = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.E.setValue(this, Y[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final Set b() {
        return (Set) this.L.getValue(this, Y[36]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final AnnotationArgumentsRenderingPolicy c() {
        return (AnnotationArgumentsRenderingPolicy) this.N.getValue(this, Y[38]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void d() {
        this.h.setValue(this, Y[6], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void e(Set set) {
        Intrinsics.h(set, "<set-?>");
        this.e.setValue(this, Y[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void f(LinkedHashSet linkedHashSet) {
        this.L.setValue(this, Y[36], linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void g() {
        this.j.setValue(this, Y[8], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void h() {
        this.c.setValue(this, Y[1], Boolean.FALSE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void i() {
        this.F.setValue(this, Y[30], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void j() {
        this.G.setValue(this, Y[31], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void k() {
        this.w.setValue(this, Y[21], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void l() {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.g;
        this.N.setValue(this, Y[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void m() {
        this.f.setValue(this, Y[4], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void n() {
        this.x.setValue(this, Y[22], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void o(ClassifierNamePolicy classifierNamePolicy) {
        this.b.setValue(this, Y[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void p() {
        RenderingFormat renderingFormat = RenderingFormat.e;
        this.D.setValue(this, Y[28], renderingFormat);
    }

    public final boolean q() {
        return ((Boolean) this.h.getValue(this, Y[6])).booleanValue();
    }
}
