package com.dynatrace.android.ragetap.measure;

import android.view.MotionEvent;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.ragetap.detection.RageTapRules;
import com.dynatrace.android.ragetap.detection.TapData;
import com.dynatrace.android.ragetap.detection.TapEventData;
import com.dynatrace.android.window.OnTouchEventListener;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class TapMonitor implements OnTouchEventListener {
    public static final String f;

    /* renamed from: a, reason: collision with root package name */
    public final RageTapDetector f14178a;
    public final MotionEventConverter b;
    public final TimeLineProvider c;
    public State d = State.d;
    public TapEventData e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final /* synthetic */ State[] g;

        static {
            State state = new State("NO_TAP", 0);
            d = state;
            State state2 = new State("TAP_DOWN", 1);
            e = state2;
            State state3 = new State("INVALID_TAP_STATE", 2);
            f = state3;
            g = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) g.clone();
        }
    }

    static {
        boolean z = Global.f14077a;
        f = "dtxTapMonitor";
    }

    public TapMonitor(RageTapDetector rageTapDetector, MotionEventConverter motionEventConverter, TimeLineProvider timeLineProvider) {
        this.f14178a = rageTapDetector;
        this.b = motionEventConverter;
        this.c = timeLineProvider;
    }

    @Override // com.dynatrace.android.window.OnTouchEventListener
    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            long jA = this.c.a();
            MotionEventConverter motionEventConverter = this.b;
            int actionIndex = motionEvent.getActionIndex();
            float x = motionEvent.getX(actionIndex);
            float f2 = motionEventConverter.f14177a;
            this.e = new TapEventData(jA, x * f2, motionEvent.getY(actionIndex) * f2, motionEvent.getEventTime());
            this.d = State.e;
            return;
        }
        boolean z = true;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 5 || actionMasked == 6) {
                    if (this.d == State.e) {
                        if (Global.f14077a) {
                            Utility.h(f, "multi-touch tap detected");
                        }
                        this.f14178a.a();
                    }
                    this.d = State.f;
                    this.e = null;
                    return;
                }
                if (Global.f14077a) {
                    Utility.h(f, "unexpected event type detected: " + motionEvent.toString());
                    return;
                }
                return;
            }
            return;
        }
        if (this.d == State.e) {
            long jA2 = this.c.a();
            MotionEventConverter motionEventConverter2 = this.b;
            int actionIndex2 = motionEvent.getActionIndex();
            float x2 = motionEvent.getX(actionIndex2);
            float f3 = motionEventConverter2.f14177a;
            TapEventData tapEventData = new TapEventData(jA2, x2 * f3, motionEvent.getY(actionIndex2) * f3, motionEvent.getEventTime());
            RageTapDetector rageTapDetector = this.f14178a;
            TapEventData tapEventData2 = this.e;
            TapData tapData = new TapData(tapEventData2, tapEventData);
            synchronized (rageTapDetector) {
                try {
                    if (rageTapDetector.l) {
                        if (Global.f14077a) {
                            Utility.h(RageTapDetector.m, "register tap: " + tapData);
                        }
                        rageTapDetector.f.getClass();
                        if (jA2 - tapEventData2.c > r3.f14174a.f14095a) {
                            if (Global.f14077a) {
                                Utility.h(RageTapDetector.m, "tap exceeds click duration");
                            }
                            rageTapDetector.a();
                        } else if (rageTapDetector.g == null) {
                            rageTapDetector.c(tapData);
                        } else {
                            RageTapRules rageTapRules = rageTapDetector.f;
                            TapData tapData2 = rageTapDetector.h;
                            rageTapRules.getClass();
                            if (tapEventData2.c - tapData2.b.c > ((long) rageTapRules.f14174a.c)) {
                                if (Global.f14077a) {
                                    Utility.h(RageTapDetector.m, "tap exceeds timespan difference");
                                }
                                rageTapDetector.a();
                                rageTapDetector.c(tapData);
                            } else {
                                RageTapRules rageTapRules2 = rageTapDetector.f;
                                TapData tapData3 = rageTapDetector.h;
                                rageTapRules2.getClass();
                                float f4 = tapEventData2.f14176a;
                                TapEventData tapEventData3 = tapData3.f14175a;
                                float f5 = f4 - tapEventData3.f14176a;
                                float f6 = tapEventData2.b - tapEventData3.b;
                                float f7 = (f6 * f6) + (f5 * f5);
                                int i = rageTapRules2.f14174a.b;
                                if (f7 > i * i) {
                                    if (Global.f14077a) {
                                        Utility.h(RageTapDetector.m, "tap exceeds dispersion radius");
                                    }
                                    rageTapDetector.a();
                                    rageTapDetector.c(tapData);
                                } else {
                                    rageTapDetector.h = tapData;
                                    int i2 = rageTapDetector.i + 1;
                                    rageTapDetector.i = i2;
                                    if (i2 < rageTapDetector.f.f14174a.d) {
                                        z = false;
                                    }
                                    if (z) {
                                        ScheduledFuture scheduledFuture = rageTapDetector.j;
                                        if (scheduledFuture != null) {
                                            scheduledFuture.cancel(false);
                                        }
                                        rageTapDetector.j = rageTapDetector.b.schedule(rageTapDetector.c, rageTapDetector.k, TimeUnit.MILLISECONDS);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.d = State.d;
        this.e = null;
    }
}
