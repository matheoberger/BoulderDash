package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The model. */
	private IModel	model;

	/** The view. */
	private IView		view;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		setView(view);
		setModel(model);
	}

	/**
	 * Control.
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	@Override
	public void control() {
		view.printMessage("Appuyer sur les touches '↑', '↓', '←' ou '→', pour vous déplacer. Ramassez le nombre de diamant attendu pour atteindre la sortie. ATTENTION AU CAILLOUX !");
	}

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *            the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	@Override
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case UP:
			return;
		case DOWN:
			return;
		case RIGHT:
			return;
		case LEFT:
			return;
		case NOTHING:
			return;
		default:
			break;
		}
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */

	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Sets the view.
	 *
	 * @param pview
	 *            the new view
	 */

	private void setView(final IView pview) {
		view = pview;
	}

}
