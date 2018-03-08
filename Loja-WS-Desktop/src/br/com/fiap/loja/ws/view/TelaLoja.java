package br.com.fiap.loja.ws.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TelaLoja {

	protected Shell shell;
	private Text txtCodigo;
	private Text txtCod;
	private Text txtNm;
	private Text txtDesc;
	private Text txtPre;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaLoja window = new TelaLoja();
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		txtCodigo = new Text(shell, SWT.BORDER);
		txtCodigo.setBounds(129, 34, 142, 21);
		
		Label lblBuscar = new Label(shell, SWT.NONE);
		lblBuscar.setBounds(10, 37, 102, 15);
		lblBuscar.setText("Codigo do produto");
		
		Button btnBuscar = new Button(shell, SWT.NONE);
		btnBuscar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
			}
		});
		btnBuscar.setBounds(307, 32, 117, 25);
		btnBuscar.setText("Buscar");
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 82, 414, 2);
		
		Label lblCodigoDoProduto = new Label(shell, SWT.NONE);
		lblCodigoDoProduto.setBounds(10, 116, 109, 15);
		lblCodigoDoProduto.setText("Codigo do Produto");
		
		Label lblNomeDoProduto = new Label(shell, SWT.NONE);
		lblNomeDoProduto.setBounds(138, 116, 102, 15);
		lblNomeDoProduto.setText("Nome do produto");
		
		Label lblPreo = new Label(shell, SWT.NONE);
		lblPreo.setBounds(358, 116, 42, 15);
		lblPreo.setText("Pre\u00E7o");
		
		Label lblDescrio = new Label(shell, SWT.NONE);
		lblDescrio.setBounds(267, 116, 55, 15);
		lblDescrio.setText("Descri\u00E7\u00E3o");
		
		txtCod = new Text(shell, SWT.BORDER);
		txtCod.setBounds(10, 137, 123, 35);
		
		txtNm = new Text(shell, SWT.BORDER);
		txtNm.setBounds(128, 137, 132, 35);
		
		txtDesc = new Text(shell, SWT.BORDER);
		txtDesc.setBounds(254, 137, 85, 35);
		
		txtPre = new Text(shell, SWT.BORDER);
		txtPre.setBounds(337, 137, 76, 35);

	}
}
