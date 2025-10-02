package androidx.window.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "OcclusionType", "Orientation", "State", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FoldingFeature extends DisplayFeature {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class OcclusionType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;", "", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "FULL", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "NONE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public final String toString() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Orientation {
        public static final Orientation b = new Orientation("VERTICAL");
        public static final Orientation c = new Orientation("HORIZONTAL");

        /* renamed from: a, reason: collision with root package name */
        public final String f3874a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation$Companion;", "", "Landroidx/window/layout/FoldingFeature$Orientation;", "HORIZONTAL", "Landroidx/window/layout/FoldingFeature$Orientation;", "VERTICAL", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public Orientation(String str) {
            this.f3874a = str;
        }

        /* renamed from: toString, reason: from getter */
        public final String getF3874a() {
            return this.f3874a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class State {
        public static final State b = new State("FLAT");
        public static final State c = new State("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name */
        public final String f3875a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$State$Companion;", "", "Landroidx/window/layout/FoldingFeature$State;", "FLAT", "Landroidx/window/layout/FoldingFeature$State;", "HALF_OPENED", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        public State(String str) {
            this.f3875a = str;
        }

        /* renamed from: toString, reason: from getter */
        public final String getF3875a() {
            return this.f3875a;
        }
    }

    boolean a();

    Orientation getOrientation();
}
