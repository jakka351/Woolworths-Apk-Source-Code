package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0005¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/savedstate/SavedStateRegistryOwner;", "e", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSavedStateRegistryOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSavedStateRegistryOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1950a = new DynamicProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalConfiguration$1.h);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalContext$1.h);
    public static final StaticProvidableCompositionLocal c = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.h);
    public static final StaticProvidableCompositionLocal d = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.h);
    public static final StaticProvidableCompositionLocal e = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.h);
    public static final StaticProvidableCompositionLocal f = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalView$1.h);

    public static final void a(final AndroidComposeView androidComposeView, final Function2 function2, Composer composer, final int i) {
        MutableState mutableState;
        LinkedHashMap linkedHashMap;
        boolean z;
        ComposerImpl composerImplV = composer.v(1396852028);
        int i2 = (composerImplV.I(androidComposeView) ? 4 : 2) | i | (composerImplV.I(function2) ? 32 : 16);
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            final Context context = androidComposeView.getContext();
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(new Configuration(context.getResources().getConfiguration()));
                composerImplV.A(objG);
            }
            final MutableState mutableState2 = (MutableState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Configuration configuration = new Configuration((Configuration) obj);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f1950a;
                        mutableState2.setValue(configuration);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objG2);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new AndroidUriHandler(context);
                composerImplV.A(objG3);
            }
            final AndroidUriHandler androidUriHandler = (AndroidUriHandler) objG3;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            SavedStateRegistryOwner savedStateRegistryOwner = viewTreeOwners.b;
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                Object parent = androidComposeView.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String strA = YU.a.A("SaveableStateRegistry:", strValueOf);
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strA);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        Intrinsics.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str, parcelableArrayList);
                        mutableState2 = mutableState2;
                    }
                } else {
                    linkedHashMap = null;
                }
                mutableState = mutableState2;
                SaveableStateRegistry saveableStateRegistryA = SaveableStateRegistryKt.a(linkedHashMap, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.h);
                try {
                    savedStateRegistry.c(strA, new androidx.activity.c(saveableStateRegistryA, 1));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                DisposableSaveableStateRegistry disposableSaveableStateRegistry = new DisposableSaveableStateRegistry(saveableStateRegistryA, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z, savedStateRegistry, strA));
                composerImplV.A(disposableSaveableStateRegistry);
                objG4 = disposableSaveableStateRegistry;
            } else {
                mutableState = mutableState2;
            }
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = (DisposableSaveableStateRegistry) objG4;
            boolean zI = composerImplV.I(disposableSaveableStateRegistry2);
            Object objG5 = composerImplV.G();
            if (zI || objG5 == composer$Companion$Empty$1) {
                objG5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final DisposableSaveableStateRegistry disposableSaveableStateRegistry3 = disposableSaveableStateRegistry2;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                ((DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1) disposableSaveableStateRegistry3.f1967a).invoke();
                            }
                        };
                    }
                };
                composerImplV.A(objG5);
            }
            EffectsKt.c(Unit.f24250a, (Function1) objG5, composerImplV);
            Object objG6 = composerImplV.G();
            if (objG6 == composer$Companion$Empty$1) {
                objG6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new NoHapticFeedback() : new DefaultHapticFeedback(androidComposeView.getView());
                composerImplV.A(objG6);
            }
            HapticFeedback hapticFeedback = (HapticFeedback) objG6;
            Configuration configuration = (Configuration) mutableState.getD();
            Object objG7 = composerImplV.G();
            if (objG7 == composer$Companion$Empty$1) {
                objG7 = new ImageVectorCache();
                composerImplV.A(objG7);
            }
            final ImageVectorCache imageVectorCache = (ImageVectorCache) objG7;
            Object objG8 = composerImplV.G();
            Object obj = objG8;
            if (objG8 == composer$Companion$Empty$1) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                composerImplV.A(configuration2);
                obj = configuration2;
            }
            final Configuration configuration3 = (Configuration) obj;
            Object objG9 = composerImplV.G();
            if (objG9 == composer$Companion$Empty$1) {
                objG9 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration4) {
                        Configuration configuration5 = configuration3;
                        int iUpdateFrom = configuration5.updateFrom(configuration4);
                        Iterator it = imageVectorCache.f2001a.entrySet().iterator();
                        while (it.hasNext()) {
                            ImageVectorCache.ImageVectorEntry imageVectorEntry = (ImageVectorCache.ImageVectorEntry) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                            if (imageVectorEntry == null || Configuration.needNewResources(iUpdateFrom, imageVectorEntry.b)) {
                                it.remove();
                            }
                        }
                        configuration5.setTo(configuration4);
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        imageVectorCache.f2001a.clear();
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i3) {
                        imageVectorCache.f2001a.clear();
                    }
                };
                composerImplV.A(objG9);
            }
            final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) objG9;
            boolean zI2 = composerImplV.I(context);
            Object objG10 = composerImplV.G();
            if (zI2 || objG10 == composer$Companion$Empty$1) {
                objG10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        final Context context2 = context;
                        Context applicationContext = context2.getApplicationContext();
                        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
                        applicationContext.registerComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12);
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                context2.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12);
                            }
                        };
                    }
                };
                composerImplV.A(objG10);
            }
            EffectsKt.c(imageVectorCache, (Function1) objG10, composerImplV);
            Object objG11 = composerImplV.G();
            if (objG11 == composer$Companion$Empty$1) {
                objG11 = new ResourceIdCache();
                composerImplV.A(objG11);
            }
            final ResourceIdCache resourceIdCache = (ResourceIdCache) objG11;
            Object objG12 = composerImplV.G();
            if (objG12 == composer$Companion$Empty$1) {
                objG12 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration4) {
                        ResourceIdCache resourceIdCache2 = resourceIdCache;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f2004a.c();
                        }
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        ResourceIdCache resourceIdCache2 = resourceIdCache;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f2004a.c();
                        }
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i3) {
                        ResourceIdCache resourceIdCache2 = resourceIdCache;
                        synchronized (resourceIdCache2) {
                            resourceIdCache2.f2004a.c();
                        }
                    }
                };
                composerImplV.A(objG12);
            }
            final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) objG12;
            boolean zI3 = composerImplV.I(context);
            Object objG13 = composerImplV.G();
            if (zI3 || objG13 == composer$Companion$Empty$1) {
                objG13 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        final Context context2 = context;
                        Context applicationContext = context2.getApplicationContext();
                        final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
                        applicationContext.registerComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12);
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                context2.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12);
                            }
                        };
                    }
                };
                composerImplV.A(objG13);
            }
            EffectsKt.c(resourceIdCache, (Function1) objG13, composerImplV);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = CompositionLocalsKt.v;
            CompositionLocalKt.b(new ProvidedValue[]{f1950a.b((Configuration) mutableState.getD()), b.b(context), LocalLifecycleOwnerKt.f2808a.b(viewTreeOwners.f1938a), e.b(savedStateRegistryOwner), SaveableStateRegistryKt.f1700a.b(disposableSaveableStateRegistry2), f.b(androidComposeView.getView()), c.b(imageVectorCache), d.b(resourceIdCache), dynamicProvidableCompositionLocal.b(Boolean.valueOf(((Boolean) composerImplV.x(dynamicProvidableCompositionLocal)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.l.b(hapticFeedback)}, ComposableLambdaKt.c(1471621628, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        CompositionLocalsKt.a(androidComposeView, androidUriHandler, function2, composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function2, i) { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
                public final /* synthetic */ Function2 i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    AndroidCompositionLocals_androidKt.a(this.h, this.i, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.f2808a;
    }

    @NotNull
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return e;
    }
}
