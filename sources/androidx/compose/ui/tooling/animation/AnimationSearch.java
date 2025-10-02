package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimationSearch {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f2174a;
    public final Function0 b;
    public final TransitionSearch c;
    public final AnimatedContentSearch d;
    public final AnimatedVisibilitySearch e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AnimateContentSizeSearch extends Search<Object> {
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void a(Collection collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!((Group) obj).getI().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Group) it.next()).getI().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).f1888a.E(new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$addAnimations$2$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean z;
                            Modifier.Element element = (Modifier.Element) obj2;
                            if (element.getClass().getName().equals("androidx.compose.animation.SizeAnimationModifierElement")) {
                                this.h.b.add(element);
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                }
            }
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            if (group.getI().isEmpty()) {
                return false;
            }
            List i = group.getI();
            if ((i instanceof Collection) && i.isEmpty()) {
                return false;
            }
            Iterator it = i.iterator();
            while (it.hasNext()) {
                if (((ModifierInfo) it.next()).f1888a.E(AnimationSearch$AnimateContentSizeSearch$hasAnimation$1$1.h)) {
                    return true;
                }
            }
            return false;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static Animatable c(CallGroup callGroup) {
            Object next;
            Object next2;
            Object next3;
            Iterator it = ((Iterable) callGroup.f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof Animatable) {
                    break;
                }
            }
            if (!(next instanceof Animatable)) {
                next = null;
            }
            Animatable animatable = (Animatable) next;
            Collection collectionQ = animatable != null ? CollectionsKt.Q(animatable) : EmptyList.d;
            Iterable iterable = (Iterable) callGroup.g;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Iterable) ((Group) it2.next()).f).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (next3 instanceof Animatable) {
                        break;
                    }
                }
                if (!(next3 instanceof Animatable)) {
                    next3 = null;
                }
                Animatable animatable2 = (Animatable) next3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                Group group = (Group) CollectionsKt.F(PreviewUtils_androidKt.b((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.h, true));
                if (group != null) {
                    arrayList2.add(group);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Iterable) ((Group) it5.next()).f).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    if (next2 instanceof Animatable) {
                        break;
                    }
                }
                if (!(next2 instanceof Animatable)) {
                    next2 = null;
                }
                Animatable animatable3 = (Animatable) next2;
                if (animatable3 != null) {
                    arrayList3.add(animatable3);
                }
            }
            return (Animatable) CollectionsKt.F(CollectionsKt.c0(CollectionsKt.c0(arrayList3, arrayList), collectionQ));
        }

        public static AnimationSpec d(CallGroup callGroup) {
            Iterable iterable = (Iterable) callGroup.g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.c(((Group) obj).b, "rememberUpdatedState")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionsKt.h((Iterable) ((Group) it.next()).g, arrayList2);
            }
            ArrayList arrayListC0 = CollectionsKt.c0(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayListC0.iterator();
            while (it2.hasNext()) {
                CollectionsKt.h((Iterable) ((Group) it2.next()).f, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof State) {
                    arrayList4.add(next);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((State) it4.next()).getD());
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (next2 instanceof AnimationSpec) {
                    arrayList6.add(next2);
                }
            }
            return (AnimationSpec) CollectionsKt.F(arrayList6);
        }

        public static MutableState e(CallGroup callGroup) {
            Object next;
            Object next2;
            Object next3;
            Iterator it = ((Iterable) callGroup.f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof MutableState) {
                    break;
                }
            }
            if (!(next instanceof MutableState)) {
                next = null;
            }
            MutableState mutableState = (MutableState) next;
            Collection collectionQ = mutableState != null ? CollectionsKt.Q(mutableState) : EmptyList.d;
            Iterable iterable = (Iterable) callGroup.g;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Iterable) ((Group) it2.next()).f).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (next3 instanceof MutableState) {
                        break;
                    }
                }
                if (!(next3 instanceof MutableState)) {
                    next3 = null;
                }
                MutableState mutableState2 = (MutableState) next3;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                Group group = (Group) CollectionsKt.F(PreviewUtils_androidKt.b((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.h, true));
                if (group != null) {
                    arrayList2.add(group);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Iterable) ((Group) it5.next()).f).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    if (next2 instanceof MutableState) {
                        break;
                    }
                }
                if (!(next2 instanceof MutableState)) {
                    next2 = null;
                }
                MutableState mutableState3 = (MutableState) next2;
                if (mutableState3 != null) {
                    arrayList3.add(mutableState3);
                }
            }
            return (MutableState) CollectionsKt.F(CollectionsKt.c0(CollectionsKt.c0(arrayList3, arrayList), collectionQ));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.Collection r8) {
            /*
                r7 = this;
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                r2 = 0
                if (r1 == 0) goto L37
                java.lang.Object r1 = r8.next()
                androidx.compose.ui.tooling.data.Group r1 = (androidx.compose.ui.tooling.data.Group) r1
                androidx.compose.ui.tooling.data.SourceLocation r3 = r1.c
                if (r3 == 0) goto L27
                java.lang.String r3 = r1.b
                java.lang.String r4 = "animateValueAsState"
                boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
                if (r3 == 0) goto L27
                goto L28
            L27:
                r1 = r2
            L28:
                if (r1 == 0) goto L31
                boolean r3 = r1 instanceof androidx.compose.ui.tooling.data.CallGroup
                if (r3 == 0) goto L31
                r2 = r1
                androidx.compose.ui.tooling.data.CallGroup r2 = (androidx.compose.ui.tooling.data.CallGroup) r2
            L31:
                if (r2 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L37:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r0 = r0.iterator()
            L40:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L94
                java.lang.Object r1 = r0.next()
                androidx.compose.ui.tooling.data.CallGroup r1 = (androidx.compose.ui.tooling.data.CallGroup) r1
                androidx.compose.animation.core.Animatable r3 = c(r1)
                androidx.compose.animation.core.AnimationSpec r4 = d(r1)
                androidx.compose.runtime.MutableState r1 = e(r1)
                if (r3 == 0) goto L8d
                if (r4 == 0) goto L8d
                if (r1 == 0) goto L8d
                java.lang.Object r5 = r1.getD()
                if (r5 != 0) goto L70
                androidx.compose.ui.tooling.animation.ToolingState r5 = new androidx.compose.ui.tooling.animation.ToolingState
                java.lang.Object r6 = r3.f()
                r5.<init>(r6)
                r1.setValue(r5)
            L70:
                androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo r5 = new androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo
                java.lang.Object r1 = r1.getD()
                boolean r6 = r1 instanceof androidx.compose.ui.tooling.animation.ToolingState
                if (r6 == 0) goto L7d
                androidx.compose.ui.tooling.animation.ToolingState r1 = (androidx.compose.ui.tooling.animation.ToolingState) r1
                goto L7e
            L7d:
                r1 = r2
            L7e:
                if (r1 != 0) goto L89
                androidx.compose.ui.tooling.animation.ToolingState r1 = new androidx.compose.ui.tooling.animation.ToolingState
                java.lang.Object r6 = r3.f()
                r1.<init>(r6)
            L89:
                r5.<init>(r3, r4, r1)
                goto L8e
            L8d:
                r5 = r2
            L8e:
                if (r5 == 0) goto L40
                r8.add(r5)
                goto L40
            L94:
                java.util.LinkedHashSet r0 = r7.b
                r0.addAll(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearch.a(java.util.Collection):void");
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            CallGroup callGroup = null;
            if (group.c == null || !Intrinsics.c(group.b, "animateValueAsState")) {
                group = null;
            }
            if (group != null && (group instanceof CallGroup)) {
                callGroup = (CallGroup) group;
            }
            return (callGroup == null || c(callGroup) == null || d(callGroup) == null || e(callGroup) == null) ? false : true;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f2175a;
        public final AnimationSpec b;
        public final ToolingState c;

        public AnimateXAsStateSearchInfo(Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState) {
            this.f2175a = animatable;
            this.b = animationSpec;
            this.c = toolingState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimateXAsStateSearchInfo)) {
                return false;
            }
            AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) obj;
            return Intrinsics.c(this.f2175a, animateXAsStateSearchInfo.f2175a) && Intrinsics.c(this.b, animateXAsStateSearchInfo.b) && Intrinsics.c(this.c, animateXAsStateSearchInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f2175a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.f2175a + ", animationSpec=" + this.b + ", toolingState=" + this.c + ')';
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public static Group c(Group group) {
            Object obj = null;
            if (group.c == null || !Intrinsics.c(group.b, "AnimatedContent")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator it = ((Iterable) group.g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((Group) next).b, "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void a(Collection collection) {
            Object next;
            Object next2;
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Group groupC = c((Group) it.next());
                if (groupC != null) {
                    arrayList.add(groupC);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = ((Iterable) ((Group) it2.next()).f).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (next2 instanceof Transition ? next2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group group = (Group) CollectionsKt.F(PreviewUtils_androidKt.b((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.h, true));
                if (group != null) {
                    arrayList3.add(group);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Iterable) ((Group) it5.next()).f).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            this.b.addAll(CollectionsKt.c0(arrayList4, arrayList2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            return c(group) != null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public static Group c(Group group) {
            Object obj = null;
            if (group.c == null || !Intrinsics.c(group.b, "AnimatedVisibility")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator it = ((Iterable) group.g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((Group) next).b, "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void a(Collection collection) {
            Object next;
            Object next2;
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Group groupC = c((Group) it.next());
                if (groupC != null) {
                    arrayList.add(groupC);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator it3 = ((Iterable) ((Group) it2.next()).f).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (next2 instanceof Transition ? next2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group group = (Group) CollectionsKt.F(PreviewUtils_androidKt.b((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.h, true));
                if (group != null) {
                    arrayList3.add(group);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Iterable) ((Group) it5.next()).f).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            this.b.addAll(CollectionsKt.c0(arrayList4, arrayList2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            return c(group) != null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
        public static MutableState c(Group group) {
            Object next;
            ?? r0 = group.f;
            ?? r4 = group.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) r4).iterator();
            while (it.hasNext()) {
                CollectionsKt.h((Iterable) ((Group) it.next()).g, arrayList);
            }
            ArrayList arrayListC0 = CollectionsKt.c0(arrayList, r4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListC0.iterator();
            while (it2.hasNext()) {
                CollectionsKt.h((Iterable) ((Group) it2.next()).f, arrayList2);
            }
            Iterator it3 = CollectionsKt.c0(arrayList2, r0).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (next instanceof MutableState) {
                    break;
                }
            }
            return (MutableState) (next instanceof MutableState ? next : null);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.Collection r9) {
            /*
                r8 = this;
                r0 = 0
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r9 = r9.iterator()
            L11:
                boolean r2 = r9.hasNext()
                r3 = 0
                if (r2 == 0) goto L3d
                java.lang.Object r2 = r9.next()
                androidx.compose.ui.tooling.data.Group r2 = (androidx.compose.ui.tooling.data.Group) r2
                androidx.compose.ui.tooling.data.SourceLocation r4 = r2.c
                if (r4 == 0) goto L2d
                java.lang.String r4 = r2.b
                java.lang.String r5 = "rememberInfiniteTransition"
                boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
                if (r4 == 0) goto L2d
                goto L2e
            L2d:
                r2 = r3
            L2e:
                if (r2 == 0) goto L37
                boolean r4 = r2 instanceof androidx.compose.ui.tooling.data.CallGroup
                if (r4 == 0) goto L37
                r3 = r2
                androidx.compose.ui.tooling.data.CallGroup r3 = (androidx.compose.ui.tooling.data.CallGroup) r3
            L37:
                if (r3 == 0) goto L11
                r1.add(r3)
                goto L11
            L3d:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r1 = r1.iterator()
            L46:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lcb
                java.lang.Object r2 = r1.next()
                androidx.compose.ui.tooling.data.CallGroup r2 = (androidx.compose.ui.tooling.data.CallGroup) r2
                java.lang.Object r4 = r2.f
                java.lang.Object r5 = r2.g
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L61:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L75
                java.lang.Object r7 = r5.next()
                androidx.compose.ui.tooling.data.Group r7 = (androidx.compose.ui.tooling.data.Group) r7
                java.lang.Object r7 = r7.f
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                kotlin.collections.CollectionsKt.h(r7, r6)
                goto L61
            L75:
                java.util.ArrayList r4 = kotlin.collections.CollectionsKt.c0(r6, r4)
                java.util.Iterator r4 = r4.iterator()
            L7d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L8c
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof androidx.compose.animation.core.InfiniteTransition
                if (r6 == 0) goto L7d
                goto L8d
            L8c:
                r5 = r3
            L8d:
                boolean r4 = r5 instanceof androidx.compose.animation.core.InfiniteTransition
                if (r4 != 0) goto L92
                r5 = r3
            L92:
                androidx.compose.animation.core.InfiniteTransition r5 = (androidx.compose.animation.core.InfiniteTransition) r5
                androidx.compose.runtime.MutableState r2 = c(r2)
                if (r5 == 0) goto Lc3
                if (r2 == 0) goto Lc3
                java.lang.Object r4 = r2.getD()
                if (r4 != 0) goto Laa
                androidx.compose.ui.tooling.animation.ToolingState r4 = new androidx.compose.ui.tooling.animation.ToolingState
                r4.<init>(r0)
                r2.setValue(r4)
            Laa:
                androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo r4 = new androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo
                java.lang.Object r2 = r2.getD()
                boolean r6 = r2 instanceof androidx.compose.ui.tooling.animation.ToolingState
                if (r6 == 0) goto Lb7
                androidx.compose.ui.tooling.animation.ToolingState r2 = (androidx.compose.ui.tooling.animation.ToolingState) r2
                goto Lb8
            Lb7:
                r2 = r3
            Lb8:
                if (r2 != 0) goto Lbf
                androidx.compose.ui.tooling.animation.ToolingState r2 = new androidx.compose.ui.tooling.animation.ToolingState
                r2.<init>(r0)
            Lbf:
                r4.<init>(r5, r2)
                goto Lc4
            Lc3:
                r4 = r3
            Lc4:
                if (r4 == 0) goto L46
                r9.add(r4)
                goto L46
            Lcb:
                java.util.LinkedHashSet r0 = r8.b
                r0.addAll(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearch.a(java.util.Collection):void");
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection] */
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            Object next;
            Group group2 = (group.c == null || !Intrinsics.c(group.b, "rememberInfiniteTransition")) ? null : group;
            if (((group2 == null || !(group2 instanceof CallGroup)) ? null : (CallGroup) group2) == null) {
                return false;
            }
            ?? r0 = group.f;
            Iterable iterable = (Iterable) group.g;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.h((Iterable) ((Group) it.next()).f, arrayList);
            }
            Iterator it2 = CollectionsKt.c0(arrayList, r0).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof InfiniteTransition) {
                    break;
                }
            }
            return (((InfiniteTransition) (next instanceof InfiniteTransition ? next : null)) == null || c(group) == null) ? false : true;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfiniteTransitionSearchInfo {

        /* renamed from: a, reason: collision with root package name */
        public final InfiniteTransition f2176a;
        public final ToolingState b;

        public InfiniteTransitionSearchInfo(InfiniteTransition infiniteTransition, ToolingState toolingState) {
            this.f2176a = infiniteTransition;
            this.b = toolingState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
            return Intrinsics.c(this.f2176a, infiniteTransitionSearchInfo.f2176a) && Intrinsics.c(this.b, infiniteTransitionSearchInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2176a.hashCode() * 31);
        }

        public final String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.f2176a + ", toolingState=" + this.b + ')';
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static class RememberSearch<T> extends Search<T> {
        public final KClass c;

        public RememberSearch(KClass kClass, Function1 function1) {
            super(function1);
            this.c = kClass;
        }

        public static Object c(Group group, KClass kClass) {
            T next;
            Iterator<T> it = ((Iterable) group.f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(next != null ? JvmClassMappingKt.e(next.getClass()) : null, kClass)) {
                    break;
                }
            }
            Intrinsics.h(kClass, "<this>");
            if (!kClass.z(next)) {
                return null;
            }
            Intrinsics.f(next, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return next;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void a(Collection collection) {
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                if (((Group) t).c != null) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object objC = c((Group) it.next(), this.c);
                if (objC != null) {
                    arrayList2.add(objC);
                }
            }
            this.b.addAll(CollectionsKt.L0(arrayList2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            return (group.c == null || c(group, this.c) == null) ? false : true;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class Search<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Lambda f2177a;
        public final LinkedHashSet b = new LinkedHashSet();

        /* JADX WARN: Multi-variable type inference failed */
        public Search(Function1 function1) {
            this.f2177a = (Lambda) function1;
        }

        public void a(Collection collection) {
        }

        public abstract boolean b(Group group);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class TransitionSearch extends Search<Transition<?>> {
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void a(Collection collection) {
            Object next;
            Object next2;
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (true) {
                Group group = null;
                if (!it.hasNext()) {
                    break;
                }
                Group group2 = (Group) it.next();
                if (group2.c != null && Intrinsics.c(group2.b, "updateTransition")) {
                    group = group2;
                }
                if (group != null) {
                    arrayList.add(group);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((Iterable) ((Group) it2.next()).f).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(next2 instanceof Transition)) {
                    next2 = null;
                }
                Transition transition = (Transition) next2;
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group group3 = (Group) CollectionsKt.F(PreviewUtils_androidKt.b((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.h, true));
                if (group3 != null) {
                    arrayList3.add(group3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator it6 = ((Iterable) ((Group) it5.next()).f).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(next instanceof Transition)) {
                    next = null;
                }
                Transition transition2 = (Transition) next;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            this.b.addAll(CollectionsKt.c0(arrayList4, arrayList2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean b(Group group) {
            if (group.c == null || !Intrinsics.c(group.b, "updateTransition")) {
                group = null;
            }
            return group != null;
        }
    }

    public AnimationSearch(Function0 function0, Function0 function02) {
        this.f2174a = function0;
        this.b = function02;
        TransitionSearch transitionSearch = new TransitionSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$transitionSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Transition transition = (Transition) obj;
                final PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                previewAnimationClock.getClass();
                previewAnimationClock.b(transition, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackTransition$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void d() {
                        TransitionComposeAnimation transitionComposeAnimation;
                        Transition transition2 = transition;
                        Object objA = transition2.f776a.a();
                        if (objA != null) {
                            Object[] enumConstants = objA.getClass().getEnumConstants();
                            Set setR0 = enumConstants != null ? ArraysKt.r0(enumConstants) : SetsKt.i(objA);
                            if (transition2.c == null) {
                                Reflection.f24268a.b(objA.getClass()).B();
                            }
                            transitionComposeAnimation = new TransitionComposeAnimation(transition2, setR0);
                        } else {
                            transitionComposeAnimation = null;
                        }
                        PreviewAnimationClock previewAnimationClock2 = previewAnimationClock;
                        if (transitionComposeAnimation != null) {
                            previewAnimationClock2.b.put(transitionComposeAnimation, new TransitionClock(transitionComposeAnimation));
                        } else {
                            previewAnimationClock2.a();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        d();
                        return Unit.f24250a;
                    }
                });
                return Unit.f24250a;
            }
        });
        this.c = transitionSearch;
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedContentSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Transition transition = (Transition) obj;
                final PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                previewAnimationClock.getClass();
                previewAnimationClock.b(transition, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void d() {
                        Object objA;
                        boolean z = AnimatedContentComposeAnimation.c;
                        boolean z2 = AnimatedContentComposeAnimation.c;
                        Transition transition2 = transition;
                        AnimatedContentComposeAnimation animatedContentComposeAnimation = null;
                        if (z2 && (objA = transition2.f776a.a()) != null) {
                            Object[] enumConstants = objA.getClass().getEnumConstants();
                            Set setR0 = enumConstants != null ? ArraysKt.r0(enumConstants) : SetsKt.i(objA);
                            if (transition2.c == null) {
                                Reflection.f24268a.b(objA.getClass()).B();
                            }
                            animatedContentComposeAnimation = new AnimatedContentComposeAnimation(transition2, setR0);
                        }
                        PreviewAnimationClock previewAnimationClock2 = previewAnimationClock;
                        if (animatedContentComposeAnimation != null) {
                            previewAnimationClock2.f.put(animatedContentComposeAnimation, new TransitionClock(animatedContentComposeAnimation));
                        } else {
                            String str = transition2.c;
                            previewAnimationClock2.a();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        d();
                        return Unit.f24250a;
                    }
                });
                return Unit.f24250a;
            }
        });
        this.d = animatedContentSearch;
        AnimatedVisibilitySearch animatedVisibilitySearch = new AnimatedVisibilitySearch(new Function1<Transition<?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedVisibilitySearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Transition transition = (Transition) obj;
                AnimationSearch animationSearch = this.h;
                final PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) animationSearch.f2174a).get();
                final Function0 function03 = animationSearch.b;
                previewAnimationClock.getClass();
                if (transition.f776a.a() instanceof Boolean) {
                    previewAnimationClock.b(transition, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void d() {
                            Transition transition2 = transition;
                            Intrinsics.f(transition2, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
                            AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation = new AnimatedVisibilityComposeAnimation(transition2);
                            function03.invoke();
                            LinkedHashMap linkedHashMap = previewAnimationClock.c;
                            AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(animatedVisibilityComposeAnimation);
                            Transition transition3 = animatedVisibilityComposeAnimation.f2173a;
                            Pair pair = Intrinsics.c(animatedVisibilityClock.b, "Enter") ? new Pair(Boolean.FALSE, Boolean.TRUE) : new Pair(Boolean.TRUE, Boolean.FALSE);
                            Boolean bool = (Boolean) pair.d;
                            bool.getClass();
                            Boolean bool2 = (Boolean) pair.e;
                            bool2.getClass();
                            transition3.m(bool, bool2);
                            linkedHashMap.put(animatedVisibilityComposeAnimation, animatedVisibilityClock);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            d();
                            return Unit.f24250a;
                        }
                    });
                }
                return Unit.f24250a;
            }
        });
        this.e = animatedVisibilitySearch;
        Set setR0 = ArraysKt.r0(new Search[]{transitionSearch, animatedVisibilitySearch});
        boolean z = AnimateXAsStateComposeAnimation.e;
        Set setR02 = EmptyList.d;
        LinkedHashSet linkedHashSetG = SetsKt.g(setR0, z ? SetsKt.i(new AnimateXAsStateSearch(new Function1<AnimateXAsStateSearchInfo<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animateXAsStateSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimationSearch.AnimateXAsStateSearchInfo) obj;
                final PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                previewAnimationClock.getClass();
                previewAnimationClock.b(animateXAsStateSearchInfo.f2175a, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimateXAsState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void d() {
                        boolean z2 = AnimateXAsStateComposeAnimation.e;
                        boolean z3 = AnimateXAsStateComposeAnimation.e;
                        AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo2 = animateXAsStateSearchInfo;
                        AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation = null;
                        if (z3 && animateXAsStateSearchInfo2.f2175a.f() != null) {
                            ToolingState toolingState = animateXAsStateSearchInfo2.c;
                            animateXAsStateComposeAnimation = new AnimateXAsStateComposeAnimation(animateXAsStateSearchInfo2.f2175a, animateXAsStateSearchInfo2.b, toolingState);
                        }
                        PreviewAnimationClock previewAnimationClock2 = previewAnimationClock;
                        if (animateXAsStateComposeAnimation == null) {
                            Animatable animatable = animateXAsStateSearchInfo2.f2175a;
                            previewAnimationClock2.a();
                            return;
                        }
                        LinkedHashMap linkedHashMap = previewAnimationClock2.d;
                        AnimateXAsStateClock animateXAsStateClock = new AnimateXAsStateClock();
                        Object objF = animateXAsStateComposeAnimation.c.f();
                        Object objF2 = animateXAsStateComposeAnimation.c.f();
                        animateXAsStateClock.f2182a = ((SnapshotMutableStateImpl) animateXAsStateComposeAnimation.f2171a.d).getD();
                        AnimationSpec animationSpec = animateXAsStateComposeAnimation.b;
                        Animatable animatable2 = animateXAsStateComposeAnimation.c;
                        TwoWayConverter twoWayConverter = animatable2.f740a;
                        animateXAsStateClock.b = AnimationKt.b(animationSpec, twoWayConverter, objF, objF2, twoWayConverter.b().invoke(animatable2.c.f));
                        linkedHashMap.put(animateXAsStateComposeAnimation, animateXAsStateClock);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        d();
                        return Unit.f24250a;
                    }
                });
                return Unit.f24250a;
            }
        })) : setR02);
        boolean z2 = InfiniteTransitionComposeAnimation.c;
        Set set = EmptySet.d;
        LinkedHashSet linkedHashSetG2 = SetsKt.g(SetsKt.g(linkedHashSetG, z2 ? SetsKt.i(new InfiniteTransitionSearch(new Function1<InfiniteTransitionSearchInfo, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$infiniteTransitionSearch$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (AnimationSearch.InfiniteTransitionSearchInfo) obj;
                final PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                previewAnimationClock.getClass();
                previewAnimationClock.b(infiniteTransitionSearchInfo.f2176a, new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void d() {
                        InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation;
                        boolean z3 = InfiniteTransitionComposeAnimation.c;
                        if (InfiniteTransitionComposeAnimation.c) {
                            AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo2 = infiniteTransitionSearchInfo;
                            ToolingState toolingState = infiniteTransitionSearchInfo2.b;
                            infiniteTransitionComposeAnimation = new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo2.f2176a);
                        } else {
                            infiniteTransitionComposeAnimation = null;
                        }
                        if (infiniteTransitionComposeAnimation != null) {
                            final PreviewAnimationClock previewAnimationClock2 = previewAnimationClock;
                            previewAnimationClock2.e.put(infiniteTransitionComposeAnimation, new InfiniteTransitionClock(infiniteTransitionComposeAnimation, new Function0<Long>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Long lValueOf;
                                    PreviewAnimationClock previewAnimationClock3 = previewAnimationClock2;
                                    Iterator it = CollectionsKt.c0(previewAnimationClock3.f.values(), CollectionsKt.c0(previewAnimationClock3.d.values(), CollectionsKt.c0(previewAnimationClock3.c.values(), previewAnimationClock3.b.values()))).iterator();
                                    Long lValueOf2 = null;
                                    if (it.hasNext()) {
                                        lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).a());
                                        while (it.hasNext()) {
                                            Long lValueOf3 = Long.valueOf(((ComposeAnimationClock) it.next()).a());
                                            if (lValueOf.compareTo(lValueOf3) < 0) {
                                                lValueOf = lValueOf3;
                                            }
                                        }
                                    } else {
                                        lValueOf = null;
                                    }
                                    long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                                    Iterator it2 = previewAnimationClock3.e.values().iterator();
                                    if (it2.hasNext()) {
                                        lValueOf2 = Long.valueOf(((InfiniteTransitionClock) it2.next()).c());
                                        while (it2.hasNext()) {
                                            Long lValueOf4 = Long.valueOf(((InfiniteTransitionClock) it2.next()).c());
                                            if (lValueOf2.compareTo(lValueOf4) < 0) {
                                                lValueOf2 = lValueOf4;
                                            }
                                        }
                                    }
                                    return Long.valueOf(Math.max(jLongValue, lValueOf2 != null ? lValueOf2.longValue() : 0L));
                                }
                            }));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        d();
                        return Unit.f24250a;
                    }
                });
                return Unit.f24250a;
            }
        })) : set), AnimatedContentComposeAnimation.c ? SetsKt.i(animatedContentSearch) : set);
        this.f = linkedHashSetG2;
        if (UnsupportedComposeAnimation.f2181a) {
            AnimateContentSizeSearch animateContentSizeSearch = new AnimateContentSizeSearch(new Function1<Object, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                    previewAnimationClock.getClass();
                    previewAnimationClock.b(obj, new PreviewAnimationClock$trackUnsupported$1(previewAnimationClock, "animateContentSize"));
                    return Unit.f24250a;
                }
            });
            Function1<TargetBasedAnimation<?, ?>, Unit> function1 = new Function1<TargetBasedAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                    previewAnimationClock.getClass();
                    previewAnimationClock.b((TargetBasedAnimation) obj, new PreviewAnimationClock$trackUnsupported$1(previewAnimationClock, "TargetBasedAnimation"));
                    return Unit.f24250a;
                }
            };
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            setR02 = ArraysKt.r0(new Search[]{animateContentSizeSearch, new TargetBasedSearch(reflectionFactory.b(TargetBasedAnimation.class), function1), new DecaySearch(reflectionFactory.b(DecayAnimation.class), new Function1<DecayAnimation<?, ?>, Unit>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) ((MutablePropertyReference0) this.h.f2174a).get();
                    previewAnimationClock.getClass();
                    previewAnimationClock.b((DecayAnimation) obj, new PreviewAnimationClock$trackUnsupported$1(previewAnimationClock, "DecayAnimation"));
                    return Unit.f24250a;
                }
            })});
        }
        LinkedHashSet linkedHashSetG3 = SetsKt.g(linkedHashSetG2, setR02);
        this.g = linkedHashSetG3;
        this.h = SetsKt.g(linkedHashSetG3, SetsKt.i(animatedContentSearch));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List listB = PreviewUtils_androidKt.b((Group) it.next(), AnimationSearch$attachAllAnimations$1$groups$1.h, false);
            Iterator it2 = this.h.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).a(listB);
            }
            TransitionSearch transitionSearch = this.c;
            transitionSearch.b.removeAll(this.e.b);
            transitionSearch.b.removeAll(this.d.b);
        }
        for (Search search : this.g) {
            List listL0 = CollectionsKt.l0(search.b);
            ?? r0 = search.f2177a;
            Iterator it3 = listL0.iterator();
            while (it3.hasNext()) {
                r0.invoke(it3.next());
            }
        }
    }

    public final boolean b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List listB = PreviewUtils_androidKt.b((Group) it.next(), AnimationSearch$searchAny$1$groups$1.h, false);
                LinkedHashSet<Search> linkedHashSet = this.f;
                if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
                    for (Search search : linkedHashSet) {
                        search.getClass();
                        List list = listB;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (search.b((Group) it2.next())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
