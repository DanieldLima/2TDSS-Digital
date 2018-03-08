package br.com.fiap.ws.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.rmi.RemoteException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

import br.com.fiap.repository.NotaRepository;

public class Tela {

	protected Shell shlCalcularNotas;
	private Text txtNAC;
	private Text txtAM;
	private Label lblAM;
	private Text textPS;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCalcularNotas.open();
		shlCalcularNotas.layout();
		while (!shlCalcularNotas.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCalcularNotas = new Shell();
		shlCalcularNotas.setImage(SWTResourceManager.getImage("C:\\Users\\logonrm\\Desktop\\calculator.png"));
		shlCalcularNotas.setSize(323, 300);
		shlCalcularNotas.setText("Calcular Notas");
		
		txtNAC = new Text(shlCalcularNotas, SWT.BORDER);
		txtNAC.setBounds(66, 27, 202, 21);
		
		Label lblNac = new Label(shlCalcularNotas, SWT.NONE);
		lblNac.setBounds(10, 30, 50, 15);
		lblNac.setText("NAC");
		
		txtAM = new Text(shlCalcularNotas, SWT.BORDER);
		txtAM.setBounds(66, 54, 202, 21);
		
		lblAM = new Label(shlCalcularNotas, SWT.NONE);
		lblAM.setBounds(10, 57, 44, 15);
		lblAM.setText("AM");
		
		Button btnCalcular = new Button(shlCalcularNotas, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Clique do botao
				float am = Float.parseFloat(txtAM.getText());
				float nac = Float.parseFloat(txtNAC.getText());
				
				try {					
					NotaRepository rep = new NotaRepository();
					float ps = rep.calcularPS(am, nac);		
					textPS.setText(String.valueOf(ps));
				} catch (RemoteException e2) {
					textPS.setText("Erro ao chamar o WS");
				}
			}
		});
		btnCalcular.setBounds(66, 103, 202, 25);
		btnCalcular.setText("Calcular");
		
		textPS = new Text(shlCalcularNotas, SWT.BORDER);
		textPS.setBounds(66, 156, 202, 21);
		
		Label lblPs = new Label(shlCalcularNotas, SWT.NONE);
		lblPs.setBounds(10, 159, 55, 15);
		lblPs.setText("PS");

	}
}
