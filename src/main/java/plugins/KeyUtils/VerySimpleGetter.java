/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.KeyUtils;

import freenet.client.async.ClientBaseCallback;
import freenet.client.async.ClientContext;
import freenet.client.async.ClientGetState;
import freenet.client.async.ClientRequester;
import freenet.keys.FreenetURI;
import freenet.node.RequestClient;
import freenet.support.Logger;

/**
 * @author saces
 *
 */
public class VerySimpleGetter extends ClientRequester {

	private static volatile boolean logDEBUG;

	static {
		Logger.registerClass(VerySimpleGetter.class);
	}

	private FreenetURI uri;

	/**
	 * @param priorityclass 
	 * @param chkscheduler 
	 * @param sskscheduler 
	 * @param client2 
	 * 
	 */
	public VerySimpleGetter(short priorityclass, FreenetURI uri2, RequestClient client2) {
		super(priorityclass, client2);
		uri = uri2;
	}
	
	@Override
	public FreenetURI getURI() {
		return uri;
	}

	@Override
	public boolean isFinished() {
		Logger.error(this, "TODO?", new Error("TODO?"));
		return false;
	}

	@Override
	public void cancel(ClientContext context) {
		Logger.error(this, "TODO?", new Error("TODO?"));
	}

	@Override
	protected void innerNotifyClients(ClientContext context) {
		// progress, ignore Logger.error(this, "TODO?", new Error("TODO?"));
	}

	@Override
	public void onTransition(ClientGetState oldState, ClientGetState newState,
			ClientContext context) {
		Logger.error(this, "TODO?", new Error("TODO?"));
	}

	@Override
	protected void innerToNetwork(ClientContext context) {
		if (logDEBUG) Logger.debug(this, "Request goes out to network now.");
	}

	@Override
	protected ClientBaseCallback getCallback() {
		// TODO Auto-generated method stub
		return null;
	}

}
