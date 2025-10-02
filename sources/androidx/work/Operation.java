package androidx.work;

/* loaded from: classes.dex */
public interface Operation {

    /* renamed from: a, reason: collision with root package name */
    public static final State.SUCCESS f3906a = new State.SUCCESS();
    public static final State.IN_PROGRESS b = new State.IN_PROGRESS();

    public static abstract class State {

        /* loaded from: classes2.dex */
        public static final class FAILURE extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f3907a;

            public FAILURE(Throwable th) {
                this.f3907a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.f3907a.getMessage() + ")";
            }
        }

        public static final class IN_PROGRESS extends State {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
