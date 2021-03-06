package titan.ccp.model.sensorregistry.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import titan.ccp.model.sensorregistry.SensorRegistry;

/**
 * {@link JsonSerializer} for {@link SensorRegistry}s.
 */
public final class SensorRegistrySerializer implements JsonSerializer<SensorRegistry> {

  @Override
  public JsonElement serialize(final SensorRegistry sensorRegistry, final Type type,
      final JsonSerializationContext context) {
    return context.serialize(sensorRegistry.getTopLevelSensor());
  }

}
