package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019RB\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0014\u0010%\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "E", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "savableRegistryEntry", "Lkotlin/Function1;", "", "H", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "I", "getResetBlock", "setResetBlock", "resetBlock", "J", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public final View D;

    /* renamed from: E, reason: from kotlin metadata */
    public final NestedScrollDispatcher dispatcher;
    public final SaveableStateRegistry F;

    /* renamed from: G, reason: from kotlin metadata */
    public SaveableStateRegistry.Entry savableRegistryEntry;

    /* renamed from: H, reason: from kotlin metadata */
    public Function1 updateBlock;

    /* renamed from: I, reason: from kotlin metadata */
    public Function1 resetBlock;

    /* renamed from: J, reason: from kotlin metadata */
    public Function1 releaseBlock;

    public ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        View view = (View) function1.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        super(context, compositionContext, i, nestedScrollDispatcher, view, owner);
        this.D = view;
        this.dispatcher = nestedScrollDispatcher;
        this.F = saveableStateRegistry;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = saveableStateRegistry != null ? saveableStateRegistry.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.b(strValueOf, new Function0<Object>() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.h.D.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        Function1 function12 = AndroidView_androidKt.f2211a;
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.h;
        this.updateBlock = androidView_androidKt$NoOpUpdate$1;
        this.resetBlock = androidView_androidKt$NoOpUpdate$1;
        this.releaseBlock = androidView_androidKt$NoOpUpdate$1;
    }

    public static final void g(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    @NotNull
    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.h;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.D);
                ViewFactoryHolder.g(viewFactoryHolder);
                return Unit.f24250a;
            }
        });
    }

    public final void setResetBlock(@NotNull Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.h;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.D);
                return Unit.f24250a;
            }
        });
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.h;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.D);
                return Unit.f24250a;
            }
        });
    }
}
