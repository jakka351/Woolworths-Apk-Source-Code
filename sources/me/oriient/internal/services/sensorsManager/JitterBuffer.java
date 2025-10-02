package me.oriient.internal.services.sensorsManager;

import android.hardware.SensorEvent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;

@Keep
/* loaded from: classes7.dex */
class JitterBuffer {
    private static final String TAG = "JitterBuffer";

    @NonNull
    private final ELog eLog;
    private final C1487a emptyEvent;

    @Nullable
    private final InterfaceC1495i errorsListener;
    private C1487a[] events;

    @NonNull
    private final Logger logger;
    private long longReadIndex;
    private long longWriteIndex;
    private final boolean print;
    private int readIndex;
    private final int reportSize;
    private final int sensorType;
    private final int size;
    private int writeIndex;

    @Nullable
    private Long lastInsertedTimestamp = null;
    private int messagesAfterDisorderCounter = -1;

    public JitterBuffer(int i, int i2, boolean z, int i3, C1487a c1487a, @Nullable InterfaceC1495i interfaceC1495i, int i4, @NonNull ELog eLog, @NonNull Logger logger) {
        this.emptyEvent = c1487a;
        this.sensorType = i3;
        this.size = i;
        this.print = z;
        this.events = new C1487a[i];
        this.errorsListener = interfaceC1495i;
        this.reportSize = i4;
        this.eLog = eLog;
        this.logger = logger;
        for (int i5 = 0; i5 < i; i5++) {
            this.events[i5] = new C1487a(i2);
        }
    }

    private void printBuffer() {
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " buffer: " + Arrays.toString(this.events));
            printIndexes();
        }
    }

    private void printIndexes() {
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " writeIndex=" + this.writeIndex + ", readIndex=" + this.readIndex + ", longWrite=" + this.longWriteIndex + ", longRead=" + this.longReadIndex);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public void add(@NonNull SensorEvent sensorEvent, long j, AppState appState) {
        ?? r17;
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " add() called with: event = [" + sensorEvent.sensor.getType() + ": " + j + "]");
        }
        int i = this.writeIndex;
        this.events[i].e = System.nanoTime();
        C1487a c1487a = this.events[i];
        c1487a.b = j;
        c1487a.f25565a = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.events[i].c;
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(fArr.length, fArr2.length));
        this.events[i].d = appState;
        long j2 = this.longWriteIndex + 1;
        this.longWriteIndex = j2;
        boolean z = true;
        int i2 = this.writeIndex + 1;
        this.writeIndex = i2;
        if (i2 >= this.size) {
            this.writeIndex = 0;
        }
        if ((j2 - this.longReadIndex) % this.reportSize == 0) {
            ELog eLog = this.eLog;
            String str = TAG;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", Integer.valueOf(this.sensorType)), new AbstractMap.SimpleEntry("bufferSize", Long.valueOf(this.longWriteIndex - this.longReadIndex))};
            HashMap map = new HashMap(2);
            for (int i3 = 0; i3 < 2; i3++) {
                Map.Entry entry = entryArr[i3];
                Object key = entry.getKey();
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                }
            }
            eLog.c(str, "Buffer of sensor reached size", Collections.unmodifiableMap(map));
        }
        Long l = this.lastInsertedTimestamp;
        if (l == null || l.longValue() <= j) {
            r17 = 1;
        } else {
            ELog eLog2 = this.eLog;
            String str2 = TAG;
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("sensorType", Integer.valueOf(this.sensorType)), new AbstractMap.SimpleEntry("timestamp", Long.valueOf(j)), new AbstractMap.SimpleEntry("buffer", Arrays.toString(this.events))};
            HashMap map2 = new HashMap(3);
            int i4 = 0;
            while (i4 < 3) {
                Map.Entry entry2 = entryArr2[i4];
                boolean z2 = z;
                Object key2 = entry2.getKey();
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key2, entry2, map2, key2) != null) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key2, "duplicate key: "));
                }
                i4++;
                z = z2;
            }
            r17 = z;
            eLog2.c(str2, "Buffer of sensor has a disorder at start", Collections.unmodifiableMap(map2));
            this.messagesAfterDisorderCounter = 0;
        }
        int i5 = this.messagesAfterDisorderCounter;
        if (i5 >= 0) {
            int i6 = i5 + 1;
            this.messagesAfterDisorderCounter = i6;
            if (i6 == 100) {
                ELog eLog3 = this.eLog;
                String str3 = TAG;
                Integer numValueOf = Integer.valueOf(this.sensorType);
                String string = Arrays.toString(this.events);
                AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("sensorType", numValueOf);
                AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry("buffer", string);
                Map.Entry[] entryArr3 = new Map.Entry[2];
                entryArr3[0] = simpleEntry;
                entryArr3[r17] = simpleEntry2;
                HashMap map3 = new HashMap(2);
                for (int i7 = 0; i7 < 2; i7++) {
                    Map.Entry entry3 = entryArr3[i7];
                    Object key3 = entry3.getKey();
                    if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key3, entry3, map3, key3) != null) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key3, "duplicate key: "));
                    }
                }
                eLog3.d(str3, "Buffer with disorder after 100 samples", Collections.unmodifiableMap(map3));
                this.messagesAfterDisorderCounter = -1;
            }
        }
        this.lastInsertedTimestamp = Long.valueOf(j);
        if (this.longWriteIndex - this.longReadIndex == this.size) {
            InterfaceC1495i interfaceC1495i = this.errorsListener;
            if (interfaceC1495i != null) {
                interfaceC1495i.a(this.sensorType);
            } else {
                clear();
            }
        }
        if (this.print) {
            printBuffer();
        }
    }

    public void addFirst(@NonNull C1487a c1487a) {
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " addFirst() called with: event = [" + c1487a + "]");
            printBuffer();
        }
        this.longReadIndex--;
        int i = this.readIndex - 1;
        this.readIndex = i;
        if (i < 0) {
            this.readIndex = this.size - 1;
        }
        this.events[this.readIndex] = c1487a;
        if (this.print) {
            printBuffer();
        }
    }

    public void clear() {
        this.readIndex = 0;
        this.writeIndex = 0;
        this.longReadIndex = 0L;
        this.longWriteIndex = 0L;
        this.lastInsertedTimestamp = null;
    }

    @NonNull
    public C1487a[] getEvents() {
        return this.events;
    }

    public int getReadIndex() {
        return this.readIndex;
    }

    public int getWriteIndex() {
        return this.writeIndex;
    }

    public boolean isEmpty() {
        return this.readIndex == this.writeIndex;
    }

    @NonNull
    public C1487a peek() {
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " peek() called");
            printBuffer();
        }
        if (isEmpty()) {
            if (this.print) {
                this.logger.d(TAG, this.sensorType + " peek: returning null");
                printBuffer();
            }
            return this.emptyEvent;
        }
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " peek: returning " + this.events[this.readIndex]);
            printBuffer();
        }
        return this.events[this.readIndex];
    }

    @NonNull
    public C1487a poll() {
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " poll() called");
            printBuffer();
        }
        if (isEmpty()) {
            if (this.print) {
                this.logger.d(TAG, this.sensorType + " poll: returning null");
                printBuffer();
            }
            return this.emptyEvent;
        }
        C1487a[] c1487aArr = this.events;
        int i = this.readIndex;
        C1487a c1487a = c1487aArr[i];
        this.longReadIndex++;
        int i2 = i + 1;
        this.readIndex = i2;
        if (i2 >= this.size) {
            this.readIndex = 0;
        }
        if (this.print) {
            this.logger.d(TAG, this.sensorType + " poll: returning " + c1487a);
            printBuffer();
        }
        return c1487a;
    }

    public long size() {
        return this.longWriteIndex - this.longReadIndex;
    }
}
