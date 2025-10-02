package au.com.woolworths.pay.sdk.web;

import YU.a;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;

@Keep
/* loaded from: classes4.dex */
public abstract class FrameResponse {

    @JSONField
    public String eventId;

    /* renamed from: au.com.woolworths.pay.sdk.web.FrameResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId;

        static {
            int[] iArr = new int[EventId.values().length];
            $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId = iArr;
            try {
                iArr[EventId.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.LOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.FOCUS_LOST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.FOCUS_GAINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[EventId.RETURN_KEY_PRESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum EventId {
        SUCCESS,
        FAILURE,
        VALID,
        INVALID,
        LOADED,
        FOCUS_LOST,
        FOCUS_GAINED,
        RETURN_KEY_PRESSED
    }

    @NonNull
    public static Class classForEventId(EventId eventId) throws ClassNotFoundException {
        switch (AnonymousClass1.$SwitchMap$au$com$woolworths$pay$sdk$web$FrameResponse$EventId[eventId.ordinal()]) {
            case 1:
                return FrameResponseSuccess.class;
            case 2:
                return FrameResponseError.class;
            case 3:
            case 4:
                return FrameResponseValidationState.class;
            case 5:
                return FrameResponseLoaded.class;
            case 6:
            case 7:
                return FrameResponseFocusState.class;
            case 8:
                return FrameResponseReturnKeyPressed.class;
            default:
                throw new ClassNotFoundException("No class for the given eventId " + eventId + ".");
        }
    }

    @NonNull
    public static EventId eventIdForString(String str) {
        str.getClass();
        switch (str) {
            case "pay-frame-loaded":
                return EventId.LOADED;
            case "pay-frame-error":
                return EventId.FAILURE;
            case "pay-frame-valid":
                return EventId.VALID;
            case "pay-frame-invalid":
                return EventId.INVALID;
            case "pay-frame-enterKey-pressed":
                return EventId.RETURN_KEY_PRESSED;
            case "pay-frame-success":
                return EventId.SUCCESS;
            case "pay-frame-focus-gain":
                return EventId.FOCUS_GAINED;
            case "pay-frame-focus-lost":
                return EventId.FOCUS_LOST;
            default:
                throw new IllegalArgumentException(a.h("No FrameResponseEventId for the given string ", str, "."));
        }
    }
}
