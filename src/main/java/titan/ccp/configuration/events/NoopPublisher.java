package titan.ccp.configuration.events;

/**
 * {@link EventPublisher} that does nothing.
 */
public class NoopPublisher implements EventPublisher {

  @Override
  public void publish(final Event event, final String value) {
    // do nothing
  }

  @Override
  public void close() {
    // nothing to close
  }

}
