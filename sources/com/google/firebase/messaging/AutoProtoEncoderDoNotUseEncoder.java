package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* loaded from: classes6.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoProtoEncoderDoNotUseEncoder f15632a = new AutoProtoEncoderDoNotUseEncoder();

    public static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {

        /* renamed from: a, reason: collision with root package name */
        public static final MessagingClientEventEncoder f15633a = new MessagingClientEventEncoder();
        public static final FieldDescriptor b;
        public static final FieldDescriptor c;
        public static final FieldDescriptor d;
        public static final FieldDescriptor e;
        public static final FieldDescriptor f;
        public static final FieldDescriptor g;
        public static final FieldDescriptor h;
        public static final FieldDescriptor i;
        public static final FieldDescriptor j;
        public static final FieldDescriptor k;
        public static final FieldDescriptor l;
        public static final FieldDescriptor m;
        public static final FieldDescriptor n;
        public static final FieldDescriptor o;
        public static final FieldDescriptor p;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("projectNumber");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("messageId");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f15415a = 2;
            c = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("instanceId");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f15415a = 3;
            d = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("messageType");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f15415a = 4;
            e = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf4, builder4);
            FieldDescriptor.Builder builder5 = new FieldDescriptor.Builder("sdkPlatform");
            AtProtobuf atProtobuf5 = new AtProtobuf();
            atProtobuf5.f15415a = 5;
            f = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf5, builder5);
            FieldDescriptor.Builder builder6 = new FieldDescriptor.Builder("packageName");
            AtProtobuf atProtobuf6 = new AtProtobuf();
            atProtobuf6.f15415a = 6;
            g = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf6, builder6);
            FieldDescriptor.Builder builder7 = new FieldDescriptor.Builder("collapseKey");
            AtProtobuf atProtobuf7 = new AtProtobuf();
            atProtobuf7.f15415a = 7;
            h = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf7, builder7);
            FieldDescriptor.Builder builder8 = new FieldDescriptor.Builder("priority");
            AtProtobuf atProtobuf8 = new AtProtobuf();
            atProtobuf8.f15415a = 8;
            i = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf8, builder8);
            FieldDescriptor.Builder builder9 = new FieldDescriptor.Builder("ttl");
            AtProtobuf atProtobuf9 = new AtProtobuf();
            atProtobuf9.f15415a = 9;
            j = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf9, builder9);
            FieldDescriptor.Builder builder10 = new FieldDescriptor.Builder("topic");
            AtProtobuf atProtobuf10 = new AtProtobuf();
            atProtobuf10.f15415a = 10;
            k = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf10, builder10);
            FieldDescriptor.Builder builder11 = new FieldDescriptor.Builder("bulkId");
            AtProtobuf atProtobuf11 = new AtProtobuf();
            atProtobuf11.f15415a = 11;
            l = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf11, builder11);
            FieldDescriptor.Builder builder12 = new FieldDescriptor.Builder("event");
            AtProtobuf atProtobuf12 = new AtProtobuf();
            atProtobuf12.f15415a = 12;
            m = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf12, builder12);
            FieldDescriptor.Builder builder13 = new FieldDescriptor.Builder("analyticsLabel");
            AtProtobuf atProtobuf13 = new AtProtobuf();
            atProtobuf13.f15415a = 13;
            n = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf13, builder13);
            FieldDescriptor.Builder builder14 = new FieldDescriptor.Builder("campaignId");
            AtProtobuf atProtobuf14 = new AtProtobuf();
            atProtobuf14.f15415a = 14;
            o = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf14, builder14);
            FieldDescriptor.Builder builder15 = new FieldDescriptor.Builder("composerLabel");
            AtProtobuf atProtobuf15 = new AtProtobuf();
            atProtobuf15.f15415a = 15;
            p = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf15, builder15);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(b, messagingClientEvent.f15661a);
            objectEncoderContext.add(c, messagingClientEvent.b);
            objectEncoderContext.add(d, messagingClientEvent.c);
            objectEncoderContext.add(e, messagingClientEvent.d);
            objectEncoderContext.add(f, messagingClientEvent.e);
            objectEncoderContext.add(g, messagingClientEvent.f);
            objectEncoderContext.add(h, messagingClientEvent.g);
            objectEncoderContext.add(i, messagingClientEvent.h);
            objectEncoderContext.add(j, messagingClientEvent.i);
            objectEncoderContext.add(k, messagingClientEvent.j);
            objectEncoderContext.add(l, 0L);
            objectEncoderContext.add(m, messagingClientEvent.k);
            objectEncoderContext.add(n, messagingClientEvent.l);
            objectEncoderContext.add(o, 0L);
            objectEncoderContext.add(p, messagingClientEvent.m);
        }
    }

    public static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {

        /* renamed from: a, reason: collision with root package name */
        public static final MessagingClientEventExtensionEncoder f15634a = new MessagingClientEventExtensionEncoder();
        public static final FieldDescriptor b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("messagingClientEvent");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f15415a = 1;
            b = au.com.woolworths.shop.checkout.ui.confirmation.c.h(atProtobuf, builder);
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((MessagingClientEventExtension) obj).f15663a);
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f15635a = new ProtoEncoderDoNotUseEncoder();
        public static final FieldDescriptor b = FieldDescriptor.b("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).add(b, ((ProtoEncoderDoNotUse) obj).a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f15635a);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.f15634a);
        encoderConfig.registerEncoder(MessagingClientEvent.class, MessagingClientEventEncoder.f15633a);
    }
}
