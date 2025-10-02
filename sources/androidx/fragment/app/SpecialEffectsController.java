package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Companion", "Effect", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f2767a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static SpecialEffectsController a(ViewGroup container, SpecialEffectsControllerFactory factory) {
            Intrinsics.h(container, "container");
            Intrinsics.h(factory, "factory");
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            DefaultSpecialEffectsController defaultSpecialEffectsControllerA = factory.a(container);
            container.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsControllerA);
            return defaultSpecialEffectsControllerA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Effect {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2768a;
        public boolean b;

        public boolean a() {
            return this instanceof DefaultSpecialEffectsController.AnimatorEffect;
        }

        public void b(ViewGroup container) {
            Intrinsics.h(container, "container");
        }

        public void c(ViewGroup container) {
            Intrinsics.h(container, "container");
        }

        public void d(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.h(backEvent, "backEvent");
            Intrinsics.h(container, "container");
        }

        public void e(ViewGroup container) {
            Intrinsics.h(container, "container");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FragmentStateManagerOperation extends Operation {
        public final FragmentStateManager l;

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentStateManagerOperation(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
            Fragment fragment2 = fragmentStateManager.c;
            Intrinsics.g(fragment2, "fragmentStateManager.fragment");
            super(state, lifecycleImpact, fragment2);
            this.l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.c.mTransitioning = false;
            this.l.l();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void e() {
            if (this.h) {
                return;
            }
            this.h = true;
            Operation.LifecycleImpact lifecycleImpact = this.b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.e;
            FragmentStateManager fragmentStateManager = this.l;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.f) {
                    Fragment fragment2 = fragmentStateManager.c;
                    Intrinsics.g(fragment2, "fragmentStateManager.fragment");
                    View viewRequireView = fragment2.requireView();
                    Intrinsics.g(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment2);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment3 = fragmentStateManager.c;
            Intrinsics.g(fragment3, "fragmentStateManager.fragment");
            View viewFindFocus = fragment3.mView.findFocus();
            if (viewFindFocus != null) {
                fragment3.setFocusedView(viewFindFocus);
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment3);
                }
            }
            View viewRequireView2 = this.c.requireView();
            Intrinsics.g(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Adding fragment " + fragment3 + " view " + viewRequireView2 + " to container in onStart");
                }
                fragmentStateManager.b();
                viewRequireView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            if (viewRequireView2.getAlpha() == BitmapDescriptorFactory.HUE_RED && viewRequireView2.getVisibility() == 0) {
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Making view " + viewRequireView2 + " INVISIBLE in onStart");
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment3.getPostOnViewCreatedAlpha());
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + fragment3.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static class Operation {

        /* renamed from: a, reason: collision with root package name */
        public State f2769a;
        public LifecycleImpact b;
        public final Fragment c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final ArrayList j;
        public final ArrayList k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LifecycleImpact {
            public static final LifecycleImpact d;
            public static final LifecycleImpact e;
            public static final LifecycleImpact f;
            public static final /* synthetic */ LifecycleImpact[] g;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                d = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                e = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                f = lifecycleImpact3;
                g = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) g.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class State {
            public static final State d;
            public static final State e;
            public static final State f;
            public static final State g;
            public static final /* synthetic */ State[] h;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public static State a(View view) {
                    Intrinsics.h(view, "<this>");
                    return (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) ? State.g : b(view.getVisibility());
                }

                public static State b(int i) {
                    if (i == 0) {
                        return State.e;
                    }
                    if (i == 4) {
                        return State.g;
                    }
                    if (i == 8) {
                        return State.f;
                    }
                    throw new IllegalArgumentException(YU.a.d(i, "Unknown visibility "));
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                }
            }

            static {
                State state = new State("REMOVED", 0);
                d = state;
                State state2 = new State("VISIBLE", 1);
                e = state2;
                State state3 = new State("GONE", 2);
                f = state3;
                State state4 = new State("INVISIBLE", 3);
                g = state4;
                h = new State[]{state, state2, state3, state4};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) h.clone();
            }

            public final void a(View view, ViewGroup container) {
                Intrinsics.h(view, "view");
                Intrinsics.h(container, "container");
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment2) {
            Intrinsics.h(fragment2, "fragment");
            this.f2769a = state;
            this.b = lifecycleImpact;
            this.c = fragment2;
            this.d = new ArrayList();
            this.i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(ViewGroup container) {
            Intrinsics.h(container, "container");
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (Effect effect : CollectionsKt.G0(this.k)) {
                effect.getClass();
                if (!effect.b) {
                    effect.b(container);
                }
                effect.b = true;
            }
        }

        public void b() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(Effect effect) {
            Intrinsics.h(effect, "effect");
            ArrayList arrayList = this.j;
            if (arrayList.remove(effect) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(State state, LifecycleImpact lifecycleImpact) {
            int iOrdinal = lifecycleImpact.ordinal();
            Fragment fragment2 = this.c;
            State state2 = State.d;
            if (iOrdinal == 0) {
                if (this.f2769a != state2) {
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment2 + " mFinalState = " + this.f2769a + " -> " + state + JwtParser.SEPARATOR_CHAR);
                    }
                    this.f2769a = state;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f2769a == state2) {
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment2 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.f2769a = State.e;
                    this.b = LifecycleImpact.e;
                    this.i = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment2 + " mFinalState = " + this.f2769a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.f2769a = state2;
            this.b = LifecycleImpact.f;
            this.i = true;
        }

        public void e() {
            this.h = true;
        }

        public final String toString() {
            StringBuilder sbU = YU.a.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbU.append(this.f2769a);
            sbU.append(" lifecycleImpact = ");
            sbU.append(this.b);
            sbU.append(" fragment = ");
            sbU.append(this.c);
            sbU.append('}');
            return sbU.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2770a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2770a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        Intrinsics.h(container, "container");
        this.f2767a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final SpecialEffectsController k(ViewGroup container, FragmentManager fragmentManager) {
        Intrinsics.h(container, "container");
        Intrinsics.h(fragmentManager, "fragmentManager");
        SpecialEffectsControllerFactory specialEffectsControllerFactoryO = fragmentManager.O();
        Intrinsics.g(specialEffectsControllerFactoryO, "fragmentManager.specialEffectsControllerFactory");
        return Companion.a(container, specialEffectsControllerFactoryO);
    }

    public static final SpecialEffectsController l(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.a(viewGroup, specialEffectsControllerFactory);
    }

    public static boolean m(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                Operation operation = (Operation) it.next();
                if (!operation.k.isEmpty()) {
                    ArrayList arrayList2 = operation.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((Effect) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                CollectionsKt.h(((Operation) it3.next()).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Operation operation) {
        Intrinsics.h(operation, "operation");
        if (operation.i) {
            Operation.State state = operation.f2769a;
            View viewRequireView = operation.c.requireView();
            Intrinsics.g(viewRequireView, "operation.fragment.requireView()");
            state.a(viewRequireView, this.f2767a);
            operation.i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c(ArrayList operations) {
        Intrinsics.h(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((Operation) it.next()).k, arrayList);
        }
        List listG0 = CollectionsKt.G0(CollectionsKt.L0(arrayList));
        int size = listG0.size();
        for (int i = 0; i < size; i++) {
            ((Effect) listG0.get(i)).c(this.f2767a);
        }
        int size2 = operations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((Operation) operations.get(i2));
        }
        List listG02 = CollectionsKt.G0(operations);
        int size3 = listG02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Operation operation = (Operation) listG02.get(i3);
            if (operation.k.isEmpty()) {
                operation.b();
            }
        }
    }

    public final void d() {
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        ArrayList arrayList = this.c;
        p(arrayList);
        c(arrayList);
    }

    public final void e(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.b) {
            try {
                Fragment fragment2 = fragmentStateManager.c;
                Intrinsics.g(fragment2, "fragmentStateManager.fragment");
                Operation operationG = g(fragment2);
                if (operationG == null) {
                    Fragment fragment3 = fragmentStateManager.c;
                    operationG = (fragment3.mTransitioning || fragment3.mRemoving) ? h(fragment3) : null;
                }
                if (operationG != null) {
                    operationG.d(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager);
                this.b.add(fragmentStateManagerOperation);
                final int i = 0;
                fragmentStateManagerOperation.d.add(new Runnable(this) { // from class: androidx.fragment.app.j
                    public final /* synthetic */ SpecialEffectsController e;

                    {
                        this.e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                SpecialEffectsController specialEffectsController = this.e;
                                ArrayList arrayList = specialEffectsController.b;
                                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation2 = fragmentStateManagerOperation;
                                if (arrayList.contains(fragmentStateManagerOperation2)) {
                                    SpecialEffectsController.Operation.State state2 = fragmentStateManagerOperation2.f2769a;
                                    View view = fragmentStateManagerOperation2.c.mView;
                                    Intrinsics.g(view, "operation.fragment.mView");
                                    state2.a(view, specialEffectsController.f2767a);
                                    break;
                                }
                                break;
                            default:
                                SpecialEffectsController specialEffectsController2 = this.e;
                                ArrayList arrayList2 = specialEffectsController2.b;
                                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation3 = fragmentStateManagerOperation;
                                arrayList2.remove(fragmentStateManagerOperation3);
                                specialEffectsController2.c.remove(fragmentStateManagerOperation3);
                                break;
                        }
                    }
                });
                final int i2 = 1;
                fragmentStateManagerOperation.d.add(new Runnable(this) { // from class: androidx.fragment.app.j
                    public final /* synthetic */ SpecialEffectsController e;

                    {
                        this.e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                SpecialEffectsController specialEffectsController = this.e;
                                ArrayList arrayList = specialEffectsController.b;
                                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation2 = fragmentStateManagerOperation;
                                if (arrayList.contains(fragmentStateManagerOperation2)) {
                                    SpecialEffectsController.Operation.State state2 = fragmentStateManagerOperation2.f2769a;
                                    View view = fragmentStateManagerOperation2.c.mView;
                                    Intrinsics.g(view, "operation.fragment.mView");
                                    state2.a(view, specialEffectsController.f2767a);
                                    break;
                                }
                                break;
                            default:
                                SpecialEffectsController specialEffectsController2 = this.e;
                                ArrayList arrayList2 = specialEffectsController2.b;
                                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation3 = fragmentStateManagerOperation;
                                arrayList2.remove(fragmentStateManagerOperation3);
                                specialEffectsController2.c.remove(fragmentStateManagerOperation3);
                                break;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.f2767a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayListJ0 = CollectionsKt.J0(this.c);
                this.c.clear();
                Iterator it = arrayListJ0.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Operation operation = (Operation) it.next();
                    if (this.b.isEmpty() || !operation.c.mTransitioning) {
                        z = false;
                    }
                    operation.g = z;
                }
                Iterator it2 = arrayListJ0.iterator();
                while (it2.hasNext()) {
                    Operation operation2 = (Operation) it2.next();
                    if (this.d) {
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + operation2);
                        }
                        operation2.b();
                    } else {
                        if (FragmentManager.Q(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation2);
                        }
                        operation2.a(this.f2767a);
                    }
                    this.d = false;
                    if (!operation2.f) {
                        this.c.add(operation2);
                    }
                }
                if (!this.b.isEmpty()) {
                    q();
                    ArrayList arrayListJ02 = CollectionsKt.J0(this.b);
                    if (arrayListJ02.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListJ02);
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListJ02, this.e);
                    boolean zM = m(arrayListJ02);
                    Iterator it3 = arrayListJ02.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((Operation) it3.next()).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zM) {
                        z = false;
                    }
                    this.d = z;
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zM + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        p(arrayListJ02);
                        c(arrayListJ02);
                    } else if (zM) {
                        p(arrayListJ02);
                        int size = arrayListJ02.size();
                        for (int i = 0; i < size; i++) {
                            a((Operation) arrayListJ02.get(i));
                        }
                    }
                    this.e = false;
                    if (FragmentManager.Q(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation g(Fragment fragment2) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.c(operation.c, fragment2) && !operation.e) {
                break;
            }
        }
        return (Operation) next;
    }

    public final Operation h(Fragment fragment2) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.c(operation.c, fragment2) && !operation.e) {
                break;
            }
        }
        return (Operation) next;
    }

    public final void i() {
        String str;
        String str2;
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f2767a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                q();
                p(this.b);
                ArrayList arrayListJ0 = CollectionsKt.J0(this.c);
                Iterator it = arrayListJ0.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).g = false;
                }
                Iterator it2 = arrayListJ0.iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (FragmentManager.Q(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2767a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.a(this.f2767a);
                }
                ArrayList arrayListJ02 = CollectionsKt.J0(this.b);
                Iterator it3 = arrayListJ02.iterator();
                while (it3.hasNext()) {
                    ((Operation) it3.next()).g = false;
                }
                Iterator it4 = arrayListJ02.iterator();
                while (it4.hasNext()) {
                    Operation operation2 = (Operation) it4.next();
                    if (FragmentManager.Q(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f2767a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.a(this.f2767a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (this.f) {
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f = false;
            f();
        }
    }

    public final void n() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                q();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    Operation operation = (Operation) objPrevious;
                    View view = operation.c.mView;
                    Intrinsics.g(view, "operation.fragment.mView");
                    Operation.State stateA = Operation.State.Companion.a(view);
                    Operation.State state = operation.f2769a;
                    Operation.State state2 = Operation.State.e;
                    if (state == state2 && stateA != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) objPrevious;
                Fragment fragment2 = operation2 != null ? operation2.c : null;
                this.f = fragment2 != null ? fragment2.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(BackEventCompat backEvent) {
        Intrinsics.h(backEvent, "backEvent");
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.c);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((Operation) it.next()).k, arrayList);
        }
        List listG0 = CollectionsKt.G0(CollectionsKt.L0(arrayList));
        int size = listG0.size();
        for (int i = 0; i < size; i++) {
            ((Effect) listG0.get(i)).d(backEvent, this.f2767a);
        }
    }

    public final void p(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Operation) arrayList.get(i)).e();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((Operation) it.next()).k, arrayList2);
        }
        List listG0 = CollectionsKt.G0(CollectionsKt.L0(arrayList2));
        int size2 = listG0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Effect effect = (Effect) listG0.get(i2);
            effect.getClass();
            ViewGroup container = this.f2767a;
            Intrinsics.h(container, "container");
            if (!effect.f2768a) {
                effect.e(container);
            }
            effect.f2768a = true;
        }
    }

    public final void q() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.b == Operation.LifecycleImpact.e) {
                View viewRequireView = operation.c.requireView();
                Intrinsics.g(viewRequireView, "fragment.requireView()");
                operation.d(Operation.State.Companion.b(viewRequireView.getVisibility()), Operation.LifecycleImpact.d);
            }
        }
    }

    public final void r(boolean z) {
        this.e = z;
    }
}
