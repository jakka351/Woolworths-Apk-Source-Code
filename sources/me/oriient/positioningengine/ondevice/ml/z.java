package me.oriient.positioningengine.ondevice.ml;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.util.EngineErrorHandler;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.support.model.Model;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: classes8.dex */
public final class z implements MlModel {

    @NotNull
    private static final y Companion = new y();
    public static final int[] i = {2, 1, 512};
    public static final int[] j;
    public static final int k;

    /* renamed from: a, reason: collision with root package name */
    public Model f26469a;
    public TensorBuffer b;
    public TensorBuffer c;
    public boolean d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;

    static {
        int[] iArr = {1, 6, 100};
        j = iArr;
        int i2 = iArr[0];
        IntProgressionIterator it = new IntRange(1, 2, 1).iterator();
        while (it.f) {
            i2 *= iArr[it.nextInt()];
        }
        k = i2;
    }

    public z() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Lazy lazyInject = di.inject(reflectionFactory.b(Logger.class));
        this.e = lazyInject;
        Lazy lazyInject2 = DiKt.getDi().inject(reflectionFactory.b(b.class));
        this.f = lazyInject2;
        this.g = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        Lazy lazyInject3 = DiKt.getDi().inject(reflectionFactory.b(EngineErrorHandler.class));
        this.h = lazyInject3;
        Ref.IntRef intRef = new Ref.IntRef();
        try {
            Model.Options.Builder builder = new Model.Options.Builder();
            builder.f26928a = Model.Device.d;
            Model.Options options = new Model.Options(builder);
            intRef.d++;
            Outcome outcomeA = ((f) ((b) lazyInject2.getD())).a();
            if (outcomeA instanceof Outcome.Success) {
                intRef.d++;
                File file = (File) ((Outcome.Success) outcomeA).getValue();
                Intrinsics.h(file, "file");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                    fileInputStream.close();
                    Intrinsics.e(map);
                    file.getName();
                    this.f26469a = Model.b(map, options);
                    intRef.d++;
                    int[] iArr = i;
                    DataType dataType = DataType.d;
                    this.b = TensorBuffer.d(iArr, dataType);
                    intRef.d++;
                    this.c = TensorBuffer.d(iArr, dataType);
                } finally {
                }
            } else if (outcomeA instanceof Outcome.Failure) {
                intRef.d += 100;
                ((Logger) lazyInject.getD()).e("TensorFlowModel", "Failed to initialize model1: ");
                ((EngineErrorHandler) lazyInject3.getD()).handleEngineError("Failed to read the configurations", new v(outcomeA, intRef));
            }
        } catch (Throwable th) {
            ((Logger) this.e.getD()).e("TensorFlowModel", "Failed to initialize model1: ", th);
            ((EngineErrorHandler) this.h.getD()).handleEngineError("Failed to read the configurations", new w(th, intRef));
        }
        intRef.d++;
        try {
            File fileFindFile = ((f) ((b) this.f.getD())).f26455a.findFile("oriientConfigurations", "extracted.ptl");
            if (fileFindFile != null) {
                fileFindFile.delete();
            }
        } catch (Throwable th2) {
            ((Logger) this.e.getD()).w("TensorFlowModel", "Failed to clean up configurations: " + th2.getMessage());
            ((ELog) this.g.getD()).w("TensorFlowModel", "Failed to clean up configurations", new x(th2, intRef));
        }
    }

    @Override // me.oriient.positioningengine.ondevice.ml.MlModel
    public final void close() {
        ((Logger) this.e.getD()).d("TensorFlowModel", "close() called");
        this.d = true;
        try {
            Model model = this.f26469a;
            if (model != null) {
                model.a();
            }
            this.f26469a = null;
        } catch (Throwable th) {
            ((ELog) this.g.getD()).e("TensorFlowModel", "Failed to close the model", th);
        }
    }

    @Override // me.oriient.positioningengine.ondevice.ml.MlModel
    public final int getInputSize() {
        return k;
    }

    @Override // me.oriient.positioningengine.ondevice.ml.MlModel
    public final double[] predict(float[] rawInput) throws PositioningEngineError.General {
        Intrinsics.h(rawInput, "rawInput");
        if (this.d) {
            return new double[7];
        }
        try {
            Model model = this.f26469a;
            if (model == null) {
                throw new PositioningEngineError.General("Model is not ready");
            }
            InterpreterApi interpreterApi = model.f26925a;
            int[] iArr = j;
            DataType dataType = DataType.d;
            TensorBuffer tensorBufferD = TensorBuffer.d(iArr, dataType);
            tensorBufferD.k(rawInput, tensorBufferD.b);
            TensorBuffer tensorBuffer = this.b;
            if (tensorBuffer == null) {
                Intrinsics.p("state1");
                throw null;
            }
            ByteBuffer byteBuffer = tensorBuffer.f26929a;
            TensorBuffer tensorBuffer2 = this.c;
            if (tensorBuffer2 == null) {
                Intrinsics.p("state2");
                throw null;
            }
            ByteBuffer[] byteBufferArr = {byteBuffer, tensorBuffer2.f26929a, tensorBufferD.f26929a};
            TensorBuffer tensorBufferD2 = TensorBuffer.d(interpreterApi.x2(1).shape(), dataType);
            int i2 = 0;
            TensorBuffer tensorBufferD3 = TensorBuffer.d(interpreterApi.x2(0).shape(), dataType);
            TensorBuffer tensorBufferD4 = TensorBuffer.d(interpreterApi.x2(2).shape(), dataType);
            interpreterApi.f0(byteBufferArr, MapsKt.j(new Pair(1, tensorBufferD2.f26929a), new Pair(0, tensorBufferD3.f26929a), new Pair(2, tensorBufferD4.f26929a)));
            this.b = tensorBufferD3;
            this.c = tensorBufferD4;
            IntRange intRangeO = RangesKt.o(0, 7);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                it.nextInt();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                arrayList.add(Double.valueOf(tensorBufferD2.h(i2)));
                i2 = i3;
            }
            return CollectionsKt.C0(arrayList);
        } catch (Exception e) {
            ((EngineErrorHandler) this.h.getD()).handleEngineError(e.getLocalizedMessage());
            return new double[7];
        }
    }
}
