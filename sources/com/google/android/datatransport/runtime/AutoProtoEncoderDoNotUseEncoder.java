package com.google.android.datatransport.runtime;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;

/* loaded from: classes.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoProtoEncoderDoNotUseEncoder f14425a = new AutoProtoEncoderDoNotUseEncoder();

    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClientMetricsEncoder f14426a = new ClientMetricsEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;
        public static final FieldDescriptor d;
        public static final FieldDescriptor e;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("window");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logSourceMetrics");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 2;
            c = c.h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("globalMetrics");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f15415a = 3;
            d = c.h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("appNamespace");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f15415a = 4;
            e = c.h(atProtobuf4, builder4);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ClientMetrics clientMetrics = (ClientMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, clientMetrics.f14457a);
            objectEncoderContext.add(c, clientMetrics.b);
            objectEncoderContext.add(d, clientMetrics.c);
            objectEncoderContext.add(e, clientMetrics.d);
        }
    }

    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* renamed from: a, reason: collision with root package name */
        public static final GlobalMetricsEncoder f14427a = new GlobalMetricsEncoder();
        public static final FieldDescriptor b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("storageMetrics");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((GlobalMetrics) obj).f14459a);
        }
    }

    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* renamed from: a, reason: collision with root package name */
        public static final LogEventDroppedEncoder f14428a = new LogEventDroppedEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("eventsDroppedCount");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("reason");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 3;
            c = c.h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, logEventDropped.a());
            objectEncoderContext.add(c, logEventDropped.b());
        }
    }

    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* renamed from: a, reason: collision with root package name */
        public static final LogSourceMetricsEncoder f14429a = new LogSourceMetricsEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("logSource");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logEventDropped");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 2;
            c = c.h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, logSourceMetrics.b());
            objectEncoderContext.add(c, logSourceMetrics.a());
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f14430a = new ProtoEncoderDoNotUseEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("clientMetrics");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((ProtoEncoderDoNotUse) obj).a());
        }
    }

    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* renamed from: a, reason: collision with root package name */
        public static final StorageMetricsEncoder f14431a = new StorageMetricsEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("currentCacheSizeBytes");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("maxCacheSizeBytes");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 2;
            c = c.h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            StorageMetrics storageMetrics = (StorageMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, storageMetrics.f14464a);
            objectEncoderContext.add(c, storageMetrics.b);
        }
    }

    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* renamed from: a, reason: collision with root package name */
        public static final TimeWindowEncoder f14432a = new TimeWindowEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("startMs");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("endMs");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 2;
            c = c.h(atProtobuf2, builder2);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            TimeWindow timeWindow = (TimeWindow) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, timeWindow.f14465a);
            objectEncoderContext.add(c, timeWindow.b);
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f14430a);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.f14426a);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.f14432a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.f14429a);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.f14428a);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.f14427a);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.f14431a);
    }
}
